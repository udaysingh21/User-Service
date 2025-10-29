package com.vrms.user.dto;

import lombok.*;
import java.time.LocalDate;
import java.util.List;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class VolunteerDTO extends UserDTO {
    private LocalDate dob;
    private String gender;
    private List<String> skills;
    private List<String> interests;
    private String availability;
    private List<String> languages;
}
