package com.vrms.user.entity;


import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.DiscriminatorValue;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@DiscriminatorValue("NGO")
public class NGOEntity extends UserEntity {
    private String registrationNumber;
    private Integer foundedYear;
    private String sector;
    private String websiteUrl;
    private String missionStatement;
    private String verificationStatus;
}
