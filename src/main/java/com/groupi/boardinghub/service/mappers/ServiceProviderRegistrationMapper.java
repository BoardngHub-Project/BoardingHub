package com.groupi.boardinghub.service.mappers;

import com.groupi.boardinghub.dto.LocationDto;
import com.groupi.boardinghub.dto.request.ServiceProviderRegistrationDto;

import com.groupi.boardinghub.model.Location;
import com.groupi.boardinghub.model.ServiceProvider;

public class ServiceProviderRegistrationMapper {

    public static ServiceProvider mapDtoToServiceProviderModel(ServiceProviderRegistrationDto serviceProviderRegistrationDto) {

        String encodedPassword = encodePassword(serviceProviderRegistrationDto.getPassword());

        Location location = mapDtoToLocationModel(serviceProviderRegistrationDto);

        return ServiceProvider.builder().username(serviceProviderRegistrationDto.getUsername())
                .email(serviceProviderRegistrationDto.getEmail())
                .phone(serviceProviderRegistrationDto.getPhone())
                .location(location)
                .password(encodedPassword)
                .serviceProviderType(serviceProviderRegistrationDto.getServiceProviderType())
                .build();
    }

    public static Location mapDtoToLocationModel(ServiceProviderRegistrationDto serviceProviderDto) {
        return Location.builder().latitude(serviceProviderDto.getLatitude()).longitude(serviceProviderDto.getLongitude()).build();
    }

    public static ServiceProviderRegistrationDto mapModelToDto(ServiceProvider serviceProvider) {

        LocationDto locationDto = mapToLocationDto(serviceProvider.getLocation());
        return ServiceProviderRegistrationDto.builder()
                .id(serviceProvider.getId())
                .username(serviceProvider.getUsername())
                .email(serviceProvider.getEmail())
                .password(serviceProvider.getPassword())
                .phone(serviceProvider.getPhone())
                .longitude(locationDto.getLongitude())
                .latitude(locationDto.getLatitude())
                .serviceProviderType(serviceProvider.getServiceProviderType())
                .build();
    }

    public static LocationDto mapToLocationDto(Location location) {
        return LocationDto.builder().longitude(location.getLongitude()).latitude(location.getLatitude()).build();
    }

    private static String encodePassword(String password) {
        //encoding logic
        return "#ekoodfef";
    }


}
