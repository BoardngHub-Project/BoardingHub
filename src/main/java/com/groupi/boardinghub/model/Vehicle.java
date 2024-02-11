package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table( name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator( name = "uuid2" , strategy = "uuid2")

    @Column(name = " vehicleId ")
    private String vehicleId;

    @Column(name = "pricePerDay")
    private  double pricePerDay;

    @Column(name = "availability")
    private String availability;

    @Column(name = "vehicleType")
    private String vehicleType;

    @Column(name = "VehicleMake")
    private String vehicleMake;

    @Column(name = "description")
    private String description;
}