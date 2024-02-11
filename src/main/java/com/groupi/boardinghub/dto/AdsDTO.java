package com.groupi.boardinghub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdsDTO {

    private String companyName;
    private String titleOfTheJob;
    private String description;
    private String contactNumber;
    private int numberOfOpportunity;
    private double salary;
    private String dateTime;
    private String partTime;
    private String fullTime;
    private String online;
    private String giveandTake;
    private String goToPlace;

}

