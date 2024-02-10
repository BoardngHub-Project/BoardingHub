package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.VehicleDTO;
import com.groupi.boardinghub.model.Vehicle;
import com.groupi.boardinghub.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private  VehicleRepository vehicleRepository;


    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public void addVehicle(@RequestBody VehicleDTO vehicleDTO){


        //mapping vehicleDTO input into vehicle details
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType(vehicleDTO.getVehicleType());
        vehicle.setVehicleMake(vehicleDTO.getVehicleMake());
        vehicle.setAvailability(vehicleDTO.getAvailability());
        vehicle.setPricePerDay(vehicleDTO.getPricePerDay());
        vehicle.setDescription(vehicleDTO.getDescription());


        vehicleRepository.save(vehicle);

    }

    //update vehicle details

    public void updateVehicleInfo(@RequestBody VehicleDTO vehicleDTO , String vehicleId){
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById( vehicleId);
        if(optionalVehicle.isPresent()){
            Vehicle vehicle = optionalVehicle.get();
            vehicle.setVehicleType(vehicleDTO.getVehicleType());
            vehicle.setVehicleMake(vehicleDTO.getVehicleMake());
            vehicle.setAvailability(vehicleDTO.getAvailability());
            vehicle.setPricePerDay(vehicleDTO.getPricePerDay());
            vehicle.setDescription(vehicleDTO.getDescription());

            vehicleRepository.save(vehicle);
        }

    }


    //delete vehicle details
    public void deleteVehicleInfo(String vehicleId){

        Optional< Vehicle > optionalVehicle = vehicleRepository.findById(vehicleId);
        if(optionalVehicle.isEmpty()) {
            throw new RuntimeException();

        }
        Vehicle vehicle = optionalVehicle.get();
        vehicleRepository.delete(vehicle);
    }


    //find by Type
//    public List<Vehicle> findVehiclesByType(String vehicleType) {
//
//        return VehicleRepository.findByVehicleType(vehicleType);
//
//    }




}
