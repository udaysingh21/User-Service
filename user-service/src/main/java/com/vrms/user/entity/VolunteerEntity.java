package com.vrms.user.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.DiscriminatorValue;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@DiscriminatorValue("VOLUNTEER")
public class VolunteerEntity extends UserEntity {
    private LocalDate dob;
    private String gender;

    @ElementCollection
    private List<String> skills;

    @ElementCollection
    private List<String> interests;

    private String availability;

    @ElementCollection
    private List<String> languages;
}
