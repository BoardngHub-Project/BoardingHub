package com.groupi.boardinghub.repository;


import java.util.Optional;

public interface TransportationHireRepository extends ServiceProviderRepository{
    Optional<Object> findById(Long id);
}
