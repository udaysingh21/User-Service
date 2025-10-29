package com.vrms.user.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class NGODTO extends UserDTO {
    private String registrationNumber;
    private Integer foundedYear;
    private String sector;
    private String websiteUrl;
    private String missionStatement;
    private String verificationStatus;
}
