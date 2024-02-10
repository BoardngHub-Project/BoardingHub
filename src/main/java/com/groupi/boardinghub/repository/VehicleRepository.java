package com.groupi.boardinghub.repository;

import com.groupi.boardinghub.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle , String> {

//    List<Vehicle> findByVehicleType(String vehicleType);
//}


//public interface VehicleRepository extends ServiceProviderRepository {
//
}
