package com.groupi.boardinghub.repository;

import com.groupi.boardinghub.model.ServiceProvider;

public interface BoardingProviderRepository extends ServiceProviderRepository {

    ServiceProvider findByEmail(String email);
}
