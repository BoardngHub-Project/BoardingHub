package com.groupi.boardinghub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Location {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy="uuid2")
    private String id;
    private String longitude;
    private String latitude;
}
