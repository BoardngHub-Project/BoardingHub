package com.groupi.boardinghub.repository;

import com.groupi.boardinghub.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, String> {

   ServiceProvider findByEmail(String email);

}
