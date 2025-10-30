package com.vrms.user.config;

import com.vrms.user.entity.AdminEntity;
import com.vrms.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;

@Configuration
public class AdminInitializer {

    @Bean
    public CommandLineRunner initAdmin(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String adminEmail = "admin@example.com";

            if (userRepository.findByEmail(adminEmail).isEmpty()) {

                AdminEntity admin = AdminEntity.builder()
                        .name("System Admin")
                        .email(adminEmail)
                        .password(passwordEncoder.encode("Admin@123"))
                        .phone("9999999999")
                        .address("HQ")
                        .employeeId("ADM001")
                        .assignedRegion("Global")
                        .permissions(Collections.singletonList("ALL_ACCESS,MANAGE_USERS,VIEW_REPORTS"))
                        .build();

                userRepository.save(admin);

                System.out.println(" Default admin created: admin@example.com / Admin@123");
            } else {
                System.out.println("ℹAdmin already exists — skipping creation.");
            }
        };
    }
}
