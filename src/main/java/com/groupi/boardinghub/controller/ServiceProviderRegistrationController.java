package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.request.ServiceProviderRegistrationDto;
import com.groupi.boardinghub.service.ServiceProviderRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service-provider")
public class ServiceProviderRegistrationController {
    @Autowired
    private ServiceProviderRegistrationService serviceProviderRegistrationService;

    @PostMapping
    public ResponseEntity<ServiceProviderRegistrationDto> registerServiceProvider(@RequestBody ServiceProviderRegistrationDto serviceProviderRegistrationDto) {
        ServiceProviderRegistrationDto savedServiceProviderDto = serviceProviderRegistrationService.addServiceProvider(serviceProviderRegistrationDto);
        return new ResponseEntity<>(savedServiceProviderDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceProviderRegistrationDto> getServiceProvider(@PathVariable(name = "id") String id){
        ServiceProviderRegistrationDto serviceProviderRegistrationDto = serviceProviderRegistrationService.getServiceProvider(id);
        return new ResponseEntity<>(serviceProviderRegistrationDto,HttpStatus.OK);
    }

    @GetMapping("/{serviceProviderType}")
    public ResponseEntity<ServiceProviderRegistrationDto> getServiceProviderByType(@PathVariable(name = "serviceProviderType") String serviceProviderType){
        ServiceProviderRegistrationDto serviceProviderRegistrationDto = serviceProviderRegistrationService.getServiceProvider(serviceProviderType);
        return new ResponseEntity<>(serviceProviderRegistrationDto,HttpStatus.OK);

    }


}
