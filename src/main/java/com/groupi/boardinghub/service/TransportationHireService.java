package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.TransportationHireDto;
import com.groupi.boardinghub.model.TransportationHire;
import com.groupi.boardinghub.repository.TransportationHireRepository;


public class TransportationHireService {

    private TransportationHireRepository transportationHireRepository;

    public TransportationHireDto create(TransportationHireDto transportationHireDto){

        TransportationHire transportationHire = new TransportationHire();
//        transportationHire.setTransportationId(transportationHireDto.getTransportationId());
        transportationHire.setVehicleType(transportationHireDto.getVehicleType());
        transportationHire.setDriverName(transportationHireDto.getDriverName());
        transportationHire.setPricePerKm(transportationHireDto.getPricePerKm());
        transportationHire.setVehicleMake(transportationHireDto.getVehicleMake());

        transportationHireRepository.save(transportationHire);

        return new TransportationHireDto(transportationHire);

    }
}
