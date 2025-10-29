package com.vrms.user.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequests {
    private String email;
    private String password;
}
