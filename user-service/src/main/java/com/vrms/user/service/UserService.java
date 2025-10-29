package com.vrms.user.service;

import com.vrms.user.dto.*;
import com.vrms.user.entity.*;
import com.vrms.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public VolunteerEntity registerVolunteer(VolunteerDTO dto) {
        VolunteerEntity entity = VolunteerEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword())) 
                .dob(dto.getDob())
                .gender(dto.getGender())
                .skills(dto.getSkills())
                .interests(dto.getInterests())
                .availability(dto.getAvailability())
                .languages(dto.getLanguages())
                .build();

        return userRepository.save(entity);
    }

    public NGOEntity registerNGO(NGODTO dto) {
        NGOEntity entity = NGOEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .registrationNumber(dto.getRegistrationNumber())
                .foundedYear(dto.getFoundedYear())
                .sector(dto.getSector())
                .websiteUrl(dto.getWebsiteUrl())
                .missionStatement(dto.getMissionStatement())
                .verificationStatus(dto.getVerificationStatus())
                .build();

        return userRepository.save(entity);
    }

    public CorporateEntity registerCorporate(CorporateDTO dto) {
        CorporateEntity entity = CorporateEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword())) 
                .registrationNumber(dto.getRegistrationNumber())
                .industry(dto.getIndustry())
                .csrFocusAreas(dto.getCsrFocusAreas())
                .budgetAllocated(dto.getBudgetAllocated())
                .websiteUrl(dto.getWebsiteUrl())
                .build();

        return userRepository.save(entity);
    }

    public AdminEntity registerAdmin(AdminDTO dto) {
        AdminEntity entity = AdminEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword())) 
                .employeeId(dto.getEmployeeId())
                .permissions(dto.getPermissions())
                .assignedRegion(dto.getAssignedRegion())
                .build();

        return userRepository.save(entity);
    }
}
