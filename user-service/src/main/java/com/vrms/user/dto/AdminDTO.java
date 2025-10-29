package com.vrms.user.dto;

import lombok.*;
import java.util.List;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AdminDTO extends UserDTO {
    private String employeeId;
    private List<String> permissions;
    private String assignedRegion;
}
