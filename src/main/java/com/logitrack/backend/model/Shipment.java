package com.logitrack.backend.model;

import com.logitrack.backend.util.ShipmentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
@Entity
@Table(name = "shipments")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(name = "tracking_number", unique = true, nullable = false)
    private String trackingNumber;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person recipient;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Person sender;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "number", column = @Column(name = "origin_number")),
            @AttributeOverride(name = "street", column = @Column(name = "origin_street")),
            @AttributeOverride(name = "locality", column = @Column(name = "origin_locality")),
            @AttributeOverride(name = "province", column = @Column(name = "origin_province")),
            @AttributeOverride(name = "country", column = @Column(name = "origin_country")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "origin_postal_code"))
    })
    private Address originAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "number", column = @Column(name = "destination_number")),
            @AttributeOverride(name = "street", column = @Column(name = "destination_street")),
            @AttributeOverride(name = "locality", column = @Column(name = "destination_locality")),
            @AttributeOverride(name = "province", column = @Column(name = "destination_province")),
            @AttributeOverride(name = "country", column = @Column(name = "destination_country")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "destination_postal_code"))
    })
    private Address destinationAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ShipmentStatus status;
}

