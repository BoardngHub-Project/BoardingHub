package com.groupi.boardinghub.service;

import com.groupi.boardinghub.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private static LocationRepository locationRepository;


}
