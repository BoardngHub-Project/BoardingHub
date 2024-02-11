package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.TransportationHireDto;
import com.groupi.boardinghub.service.TransportationHireService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class TransportationController {

    private TransportationHireService transportationHireService;
    @PostMapping("api/transportation/hire/create")
    public ResponseEntity<String> createAdd(@RequestBody TransportationHireDto transportationHireDto){
        return ResponseEntity.status(HttpStatus.CREATED).body("Add created Successfully ");
    }
}
