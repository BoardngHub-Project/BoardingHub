package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("MEAL_PROVIDER")
public class MealProvider extends ServiceProvider{


    @OneToOne
    //@Column(name = "location")
    private Location location;
}
