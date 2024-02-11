package com.groupi.boardinghub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="JobAd")
public class Ads {
    @GeneratedValue(generator = "UUID2")
    @GenericGenerator(name="uuid2",strategy = "uuid2")
    @jakarta.persistence.Id

    @Column(name = "id")
    private Long id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "titleOfTheJob")
    private String titleOfTheJob;

    @Column(name = "description")
    private String description;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "numberOfOpportunity")
    private int numberOfOpportunity;

    @Column(name = "salary")
    private double salary;

    @Column(name = "dateTime")
    private String dateTime;

    @Column(name = "partTime")
    private String partTime;

    @Column(name = "fullTime")
    private String fullTime;

    @Column(name = "online")
    private String online;

    @Column(name = "giveandTake")
    private String giveandTake;

    @Column(name = "goToPlace")
    private String goToPlace;



}



