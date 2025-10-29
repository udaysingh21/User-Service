package com.vrms.user.dto;

import lombok.*;
import java.util.List;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CorporateDTO extends UserDTO {
    private String registrationNumber;
    private String industry;
    private List<String> csrFocusAreas;
    private Double budgetAllocated;
    private String websiteUrl;
}
