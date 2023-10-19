package com.groupi.boardinghub.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LocationDto {
    private String longitude;
    private String latitude;
}
