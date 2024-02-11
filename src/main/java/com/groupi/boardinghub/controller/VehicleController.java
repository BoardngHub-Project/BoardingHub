package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.VehicleDTO;
import com.groupi.boardinghub.model.Vehicle;
import com.groupi.boardinghub.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/api/vehicle/create")
    public ResponseEntity<String> saveVehicleDetails(@RequestBody VehicleDTO vehicleDTO) {

        vehicleService.addVehicle(vehicleDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Vehicle Detail Save successfully");
    }


    //update vehicle detail
    @PutMapping("api/vehicle/update")
    public ResponseEntity<Void> updateVehicleInfo(@RequestBody VehicleDTO vehicleDTO, @RequestParam("vehicleId") String vehicleId) {
        vehicleService.updateVehicleInfo(vehicleDTO, vehicleId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("api/vehicle/delete")
    //delete vehicle detail
    public ResponseEntity<String> deleteVehicle(@RequestParam String vehicleId) {
        vehicleService.deleteVehicleInfo(vehicleId);
        return ResponseEntity.ok().build();
    }

    //find by type
//    @GetMapping("/api/vehicle/type")
//    public List<Vehicle> findByVehicleType(@RequestParam String vehicleType) {
//        return vehicleService.findVehiclesByType(vehicleType);
//
//    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/type/{type}")
    public List<Vehicle> getVehiclesByType(@PathVariable String type) {
        return vehicleService.findVehiclesByType(type);

    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("api/vehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }


}




