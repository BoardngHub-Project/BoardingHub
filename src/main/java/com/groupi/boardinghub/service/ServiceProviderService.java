package com.groupi.boardinghub.service;

import com.groupi.boardinghub.model.ServiceProvider;
import com.groupi.boardinghub.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProviderService {


        @Autowired
        private static ServiceProviderRepository serviceProviderRepository;

        @Autowired
        public ServiceProviderService(ServiceProviderRepository serviceProviderRepository) {
            this.serviceProviderRepository = serviceProviderRepository;
        }

        public static ServiceProvider findByEmail(String email) {
            return serviceProviderRepository.findByEmail(email);
        }



}
