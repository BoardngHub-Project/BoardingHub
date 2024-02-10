package com.groupi.boardinghub.dto;

import com.groupi.boardinghub.model.Location;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardingPlaceGigDto {
//Class to hold Boarding place gig data provided by the boarding place service provider

private String gigTitle;
private String description;
private double pricePerRoom;
private int noOfAvailableRooms;
private String longitude;
private String latitude;


}
