package com.vrms.user.entity;

import jakarta.persistence.*;
import lombok.*;
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

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private String gender;

    @ElementCollection
    private List<String> skills;

    @ElementCollection
    @Column(nullable = false)
    private List<String> interests;

    @Column(nullable = false)
    private String availability;

    @ElementCollection
    private List<String> languages;
}
