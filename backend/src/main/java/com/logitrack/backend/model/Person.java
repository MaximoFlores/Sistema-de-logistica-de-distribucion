package com.logitrack.backend.model;

import com.logitrack.backend.util.IdentificationType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
@Entity
@Table(name = "persons",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = { "identification_type", "identification_number"}
                )
        }
)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "identification_type", nullable = false)
    private IdentificationType identificationType;

    @Column(name = "identification_number", nullable = false)
    private String identificationNumber;

    private String phone;

    @Column(nullable = false)
    private String email;

}