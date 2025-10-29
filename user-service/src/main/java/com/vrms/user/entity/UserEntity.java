package com.vrms.user.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    private String phone;
    private String address;

    // 🔹 Hibernate automatically manages the "role" column via @DiscriminatorValue on subclasses

    @Transient
    public String getRoleType() {
        DiscriminatorValue dv = this.getClass().getAnnotation(DiscriminatorValue.class);
        return (dv != null) ? dv.value() : "UNKNOWN";
    }
}
