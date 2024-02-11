package com.groupi.boardinghub.repository;

import com.groupi.boardinghub.model.Ads;
import com.groupi.boardinghub.model.BoardingPlaceGig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends JpaRepository<BoardingPlaceGig,Long> {

    static void save(Ads newAds) {
    }
}
