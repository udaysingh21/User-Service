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
@DiscriminatorValue("ADMIN")
public class AdminEntity extends UserEntity {
    private String employeeId;

    @ElementCollection
    private List<String> permissions;

    private String assignedRegion;
}
