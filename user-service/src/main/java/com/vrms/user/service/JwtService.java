package com.vrms.user.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;


@Service
public class JwtService {

    private static final String SECRET_KEY = "thisisaverylongsecretkeyforjwtgeneration1234567890";
    private final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    // 🟢 Generate Access Token (short-lived)
    public String generateAccessToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    // 🟢 Generate Refresh Token (long-lived)
    public String generateRefreshToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 7)) // 7 days
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    // 🧠 Extract email (username)
    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }

    // ✅ Validate Refresh Token
    public boolean validateRefreshToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }

    public Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // ✅ Check if the token is valid for a given user
    public boolean isTokenValid(String token, com.vrms.user.entity.UserEntity user) {
        final String username = extractUsername(token);
        return (username.equals(user.getEmail()) && !isTokenExpired(token));
    }

    // ✅ Check if token is expired
    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // ✅ Extract expiration date
    private Date extractExpiration(String token) {
        return extractAllClaims(token).getExpiration();
    }

    // ✅ Overloaded method: validates a token without requiring user details
public boolean isTokenValid(String token) {
    try {
        Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
        return true;
    } catch (JwtException e) {
        return false;
    }
}


    public String refreshAccessToken(String refreshToken) {
    // Validate the refresh token
    if (!isTokenValid(refreshToken)) {
        throw new RuntimeException("Invalid refresh token");
    }

    // Extract email from refresh token
    String email = extractUsername(refreshToken);

    // Generate new access token
    return generateAccessToken(email);
}


}
