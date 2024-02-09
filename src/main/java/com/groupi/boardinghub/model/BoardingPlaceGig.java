package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

//Model Class to represent gigs created by the boarding service providers
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="BoardingPlaceGigs")
public class BoardingPlaceGig {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy="uuid2")
    private String gigId;
    private String gigTitle;
    private String description;
    private double pricePerRoom;
    private int noOfAvailableRooms;
    @OneToOne
    @JoinColumn(name = "locationId")
    private Location locationId;
    @OneToMany(mappedBy="gigId")
    private List<Review> reviews;


}
