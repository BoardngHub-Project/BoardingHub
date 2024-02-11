package com.groupi.boardinghub.controller;


import com.groupi.boardinghub.dto.AdsDTO;
import com.groupi.boardinghub.model.Ads;
import com.groupi.boardinghub.repository.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/ads")
public class AdsController {


    @Autowired

    private AdsRepository adsRepository;


    @PostMapping("/AddService")
    public ResponseEntity<String> createAds(@RequestBody AdsDTO AdsDTO) {

        Ads newAds = new Ads();
        newAds.setCompanyName(AdsDTO.getCompanyName());
        newAds.setTitleOfTheJob(AdsDTO.getTitleOfTheJob());
        newAds.setDescription(AdsDTO.getDescription());

        newAds.setContactNumber(AdsDTO.getContactNumber());
        newAds.setNumberOfOpportunity(AdsDTO.getNumberOfOpportunity());
        newAds.setSalary(AdsDTO.getSalary());
        newAds.setDateTime(AdsDTO.getDateTime());

        newAds.setPartTime(AdsDTO.getPartTime());
        newAds.setFullTime(AdsDTO.getFullTime());
        newAds.setOnline(AdsDTO.getOnline());
        newAds.setGiveandTake(AdsDTO.getGiveandTake());
        newAds.setGoToPlace(AdsDTO.getGoToPlace());




        AdsRepository.save(newAds);

        return ResponseEntity.status(HttpStatus.CREATED).body("Ads Successfully Created...");
    }
}
