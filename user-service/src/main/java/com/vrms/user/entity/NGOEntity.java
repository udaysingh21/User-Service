package com.vrms.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@DiscriminatorValue("NGO")
public class NGOEntity extends UserEntity {

    @Column(nullable = false)
    private String registrationNumber;

    @Column(nullable = false)
    private Integer foundedYear;

    @Column(nullable = false)
    private String sector;

    @Column(nullable = false)
    private String websiteUrl;

    private String missionStatement; // optional
    private String verificationStatus;
}
