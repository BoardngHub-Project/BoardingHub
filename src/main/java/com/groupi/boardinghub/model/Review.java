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
@Table(name="Reviews")
public class Review {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy="uuid2")
    @Column(name = "Review_Title")
    private String reviewId;
    @Column(name = "Title")
    private String title;
    @Column(name = "Review_Body")
    private String body;
    @ManyToOne
    @JoinColumn(name="BoardingPlaceGigId")
    private BoardingPlaceGig gigId;
}
