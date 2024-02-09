package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.LogInDTO;
import com.groupi.boardinghub.model.ServiceProvider;
import com.groupi.boardinghub.model.User;
import com.groupi.boardinghub.model.enums.ServiceProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class LoginService {

    @Autowired
    private PasswordEncoder passwordEncoder; //BCryptPasswordEncoder
    public String logIn(@RequestBody LogInDTO loginDto){

        User user= UserService.findByEmail(loginDto.getEmail());
        ServiceProvider serviceProvider=ServiceProviderRegistrationService.getServiceProviderbyEmail(loginDto.getEmail());
        if(user==null || serviceProvider==null){
            return "Account not found";
        }else if(passwordEncoder.matches(loginDto.getPassword(),user.getPassword()) || passwordEncoder.matches(loginDto.getPassword(),serviceProvider.getPassword())) {
            if(user== null && serviceProvider.getServiceProviderType()== ServiceProviderType.BOARDING_PLACE) {
                return "BoardingPlaceProvider Logged in Successfully!...";
            }else if(user== null && serviceProvider.getServiceProviderType()== ServiceProviderType.MEAL_PROVIDER) {
                return "MealProvider Logged in Successfully!...";
            }else if(user== null && serviceProvider.getServiceProviderType()== ServiceProviderType.TRANSPORT_PROVIDER){
                return "TransportProvider Logged in Successfully!...";
            }else{
                return "PartTimeJopProvider Logged in Successfully!...";
            }
        }else{
            return "Incorrect Credentials...";
        }
    }
}
