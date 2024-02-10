package com.groupi.boardinghub.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class VehicleDTO {


//    private String vehicleId;
    private  Double pricePerDay;
    private String availability;
    private String vehicleType;
    private String vehicleMake;
    private String description;

}
