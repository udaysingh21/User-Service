package com.vrms.user.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@DiscriminatorValue("CORPORATE")
public class CorporateEntity extends UserEntity {
    private String registrationNumber;
    private String industry;

    @ElementCollection
    private List<String> csrFocusAreas;

    private Double budgetAllocated;
    private String websiteUrl;
}
