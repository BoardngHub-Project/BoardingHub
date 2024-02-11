package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transportationHire")
public class TransportationHire {


    @Id
    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator( name = "uuid2" , strategy = "org.hibernate.id.UUIDGenerator")
    @GenericGenerator(name = "uuid2",strategy="uuid2")

    private String transportationId;

    private String vehicleType;
    private String driverName;
    private String vehicleMake;
    private double pricePerKm;
//
//    @OneToMany(mappedBy = "transportationId")
//    private List<Review> reviews;

//    private String imageUrl;

}



