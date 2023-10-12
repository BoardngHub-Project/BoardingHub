package com.groupi.boardinghub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    //@JsonProperty("company")-can give a short name
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;



}
