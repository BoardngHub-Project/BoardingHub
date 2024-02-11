package com.groupi.boardinghub.dto;

import com.groupi.boardinghub.model.TransportationHire;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TransportationHireDto {


//    private Long transportationId;
    private String vehicleType;
    private String driverName;
    private String vehicleMake;
    private double pricePerKm;
    private String description;

    public TransportationHireDto(TransportationHire transportationHire) {

        this.vehicleType = transportationHire.getVehicleType();
        this.driverName = transportationHire.getDriverName();
        this.pricePerKm = transportationHire.getPricePerKm();
        this.vehicleMake = transportationHire.getVehicleMake();

    }


}
