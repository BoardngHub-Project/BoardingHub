package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.LocationDto;
import com.groupi.boardinghub.dto.request.ServiceProviderRegistrationDto;
import com.groupi.boardinghub.model.ServiceProvider;
import com.groupi.boardinghub.repository.ServiceProviderRepository;
import com.groupi.boardinghub.model.Location;
import com.groupi.boardinghub.repository.LocationRepository;
import com.groupi.boardinghub.service.mappers.ServiceProviderRegistrationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceProviderRegistrationService {

    @Autowired
    private static ServiceProviderRepository serviceProviderRepository;

    @Autowired
    private static LocationRepository locationRepository;

    public ServiceProviderRegistrationDto addServiceProvider(ServiceProviderRegistrationDto serviceProviderRegistrationDto) {

        ServiceProvider serviceProvider = ServiceProviderRegistrationMapper.mapDtoToServiceProviderModel(serviceProviderRegistrationDto);
        LocationDto locationDto = ServiceProviderRegistrationMapper.mapToLocationDto(serviceProvider.getLocation());
        Location location = ServiceProviderRegistrationMapper.mapDtoToLocationModel(serviceProviderRegistrationDto);

        ServiceProvider savedServiceProvider = serviceProviderRepository.save(serviceProvider);
        Location savedLocation = locationRepository.save(location);

        ServiceProviderRegistrationDto savedServiceProviderDto = ServiceProviderRegistrationMapper.mapModelToDto(savedServiceProvider);

        return savedServiceProviderDto;
    }

    public ServiceProviderRegistrationDto getServiceProvider(String id) {
        Optional<ServiceProvider> serviceProvider = serviceProviderRepository.findById(id);
        if (serviceProvider.isPresent()) {
            ServiceProviderRegistrationDto getServiceProviderDto = ServiceProviderRegistrationMapper.mapModelToDto(serviceProvider.get());
            return getServiceProviderDto;
        }
        return null;
    }

    public static ServiceProvider getServiceProviderbyEmail(String email){
        ServiceProvider serviceProvider = serviceProviderRepository.findByEmail(email);
        return serviceProvider;

    }

}
