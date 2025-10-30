// package com.vrms.user.controller;

// import com.vrms.user.dto.LoginRequests;
// import com.vrms.user.entity.UserEntity;
// import com.vrms.user.repository.UserRepository;
// import com.vrms.user.service.JwtService;
// import lombok.RequiredArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.http.ResponseEntity;

// import java.util.HashMap;
// import java.util.Map;

// @Slf4j
// @RestController
// @RequestMapping("/api/users")
// @RequiredArgsConstructor
// public class UserController {

//     private final UserRepository userRepository;
//     private final PasswordEncoder passwordEncoder;
//     private final JwtService jwtService;

//     /**
//      * 🔐 User Login Endpoint
//      */
//     @PostMapping("/login")
//     public Map<String, String> login(@RequestBody LoginRequests request) {
//         log.info("Login attempt for email: {}", request.getEmail());

//         UserEntity user = userRepository.findByEmail(request.getEmail())
//                 .orElseThrow(() -> {
//                     log.error("User not found with email: {}", request.getEmail());
//                     return new RuntimeException("User not found");
//                 });

//         if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
//             log.warn("Invalid password attempt for user: {}", request.getEmail());
//             throw new RuntimeException("Invalid password");
//         }

//         // Generate JWT tokens
//         String accessToken = jwtService.generateAccessToken(user.getEmail());
//         String refreshToken = jwtService.generateRefreshToken(user.getEmail());

//         log.info("User {} logged in successfully. Access and Refresh tokens generated.", request.getEmail());

//         Map<String, String> response = new HashMap<>();
//         response.put("access_token", accessToken);
//         response.put("refresh_token", refreshToken);

//         return response;
//     }

//     /**
//      * ♻️ Refresh Access Token using Refresh Token
//      */
//     @PostMapping("/refresh-token")
//     public ResponseEntity<?> refreshAccessToken(@RequestBody Map<String, String> request) {
//         log.info("Access token refresh request received.");

//         String refreshToken = request.get("refreshToken");
//         if (refreshToken == null) {
//             log.error("Refresh token missing in request body.");
//             throw new RuntimeException("Refresh token is missing");
//         }

//         try {
//             String newAccessToken = jwtService.refreshAccessToken(refreshToken);
//             log.info("New access token successfully generated using refresh token.");
//             return ResponseEntity.ok(Map.of("accessToken", newAccessToken));
//         } catch (Exception e) {
//             log.error("Error while refreshing access token: {}", e.getMessage());
//             return ResponseEntity.badRequest().body(Map.of("error", "Invalid refresh token"));
//         }
//     }
// }

package com.vrms.user.controller;

import com.vrms.user.dto.*;
import com.vrms.user.entity.*;
import com.vrms.user.repository.UserRepository;
import com.vrms.user.service.JwtService;
import com.vrms.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    // =====================================================
    //  REGISTRATION ENDPOINTS
    // =====================================================

    @PostMapping("/register/volunteer")
    public VolunteerEntity registerVolunteer(@RequestBody VolunteerDTO dto) {
        log.info("Registering new Volunteer: {}", dto.getEmail());
        return userService.registerVolunteer(dto);
    }

    @PostMapping("/register/ngo")
    public NGOEntity registerNGO(@RequestBody NGODTO dto) {
        log.info("Registering new NGO: {}", dto.getEmail());
        return userService.registerNGO(dto);
    }

    @PostMapping("/register/corporate")
    public CorporateEntity registerCorporate(@RequestBody CorporateDTO dto) {
        log.info("Registering new Corporate: {}", dto.getEmail());
        return userService.registerCorporate(dto);
    }


    // =====================================================
    // LOGIN ENDPOINT (with JWT)
    // =====================================================

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequests request) {
        log.info("Login attempt for email: {}", request.getEmail());

        UserEntity user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> {
                    log.error("User not found with email: {}", request.getEmail());
                    return new RuntimeException("User not found");
                });

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            log.warn("Invalid password attempt for user: {}", request.getEmail());
            throw new RuntimeException("Invalid password");
        }

        // Generate Access & Refresh Tokens
        String accessToken = jwtService.generateAccessToken(user.getEmail());
        String refreshToken = jwtService.generateRefreshToken(user.getEmail());

        log.info("User {} logged in successfully. Tokens generated.", request.getEmail());

        Map<String, String> response = new HashMap<>();
        response.put("access_token", accessToken);
        response.put("refresh_token", refreshToken);

        return response;
    }


    @PostMapping("/refresh-token")
    public ResponseEntity<?> refreshAccessToken(@RequestBody Map<String, String> request) {
        log.info("Access token refresh request received.");

        String refreshToken = request.get("refreshToken");
        if (refreshToken == null) {
            log.error("Refresh token missing in request body.");
            throw new RuntimeException("Refresh token is missing");
        }

        try {
            String newAccessToken = jwtService.refreshAccessToken(refreshToken);
            log.info("New access token successfully generated using refresh token.");
            return ResponseEntity.ok(Map.of("accessToken", newAccessToken));
        } catch (Exception e) {
            log.error("Error while refreshing access token: {}", e.getMessage());
            return ResponseEntity.badRequest().body(Map.of("error", "Invalid refresh token"));
        }
    }
}
