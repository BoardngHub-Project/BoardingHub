package com.groupi.boardinghub.model;

import com.groupi.boardinghub.model.enums.ServiceProviderType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("BOARDING_PLACE")
public class BoardingPlace extends ServiceProvider {
    @Column(name = "number_of_rooms")
    private int numberOfRooms;
}
