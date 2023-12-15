package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transportationHire")
public class TransportationHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String vehicleType;
    private String driverName;
    private String vehicleMake;
    private double pricePerKm;
    private String imageUrl;

}



