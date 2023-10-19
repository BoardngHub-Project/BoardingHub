package com.groupi.boardinghub.dto.request;

import com.groupi.boardinghub.dto.LocationDto;
import com.groupi.boardinghub.model.Location;
import com.groupi.boardinghub.model.enums.ServiceProviderType;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ServiceProviderRegistrationDto {
    private String id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private LocationDto locationDto;
    private ServiceProviderType serviceProviderType;
}
