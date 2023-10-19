package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.request.ServiceProviderRegistrationDto;
import com.groupi.boardinghub.model.ServiceProvider;
import com.groupi.boardinghub.repository.ServiceProviderRepository;
import com.groupi.boardinghub.service.mappers.ServiceProviderRegistrationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceProviderRegistrationService {

    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    public ServiceProviderRegistrationDto addServiceProvider(ServiceProviderRegistrationDto serviceProviderRegistrationDto) {

        ServiceProvider serviceProvider = ServiceProviderRegistrationMapper.mapDtoToServiceProviderModel(serviceProviderRegistrationDto);

        ServiceProvider savedServiceProvider = serviceProviderRepository.save(serviceProvider);

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

}
