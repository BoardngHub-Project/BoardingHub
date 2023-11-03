package com.groupi.boardinghub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

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


}
