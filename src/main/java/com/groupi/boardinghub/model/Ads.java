package com.groupi.boardinghub.model;

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
    private Long id;
    private String jobTitle;
    private String description;
    private Date date;
    private Double salary;
    private String contactNumber;


}



