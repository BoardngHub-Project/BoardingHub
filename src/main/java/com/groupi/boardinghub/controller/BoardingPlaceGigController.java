package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.BoardingPlaceGigDto;
import com.groupi.boardinghub.model.BoardingPlaceGig;
import com.groupi.boardinghub.model.Location;
import com.groupi.boardinghub.repository.BoardingPlaceGigRepository;
import com.groupi.boardinghub.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/Dashboard")
public class BoardingPlaceGigController {

    @Autowired
    private BoardingPlaceGigRepository boardingPlaceGigRepository;

    @Autowired
    private LocationRepository locationRepository;

    @PostMapping("/AddService")
    public ResponseEntity<String> createGig(@RequestBody BoardingPlaceGigDto boardingPlaceGigDto) {

            BoardingPlaceGig newGig = new BoardingPlaceGig();
            newGig.setGigTitle(boardingPlaceGigDto.getGigTitle());
            newGig.setDescription(boardingPlaceGigDto.getDescription());
            newGig.setPricePerRoom(boardingPlaceGigDto.getPricePerRoom());
            newGig.setNoOfAvailableRooms(boardingPlaceGigDto.getNoOfAvailableRooms());
            Location location = new Location();
            location.setLatitude(boardingPlaceGigDto.getLatitude());
            location.setLongitude(boardingPlaceGigDto.getLongitude());
            locationRepository.save(location);
            newGig.setLocationId(location);
            boardingPlaceGigRepository.save(newGig);

            return ResponseEntity.status(HttpStatus.CREATED).body("Gig Successfully Created...");
    }



}
