package com.vrms.user.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address; 
    private String role;     // e.g., ADMIN / VOLUNTEER / CORPORATE
}
