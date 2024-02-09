package com.groupi.boardinghub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProviderProfileDto {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String profilePicture;

}
