package com.tnsdc.hotelapi.hotelrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsdc.hotelapi.hotelentity.surveyentity;

@Repository
public interface surveyrepository extends JpaRepository<surveyentity, String> {
    
}