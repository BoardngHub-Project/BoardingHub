package com.groupi.boardinghub.repository;


import com.groupi.boardinghub.model.TransportationHire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransportationHireRepository extends JpaRepository< TransportationHire , String> {
}
