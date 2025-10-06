package com.xworkz.travel.repo;

import com.xworkz.travel.dto.TravellerDto;

public interface TravellerRepo {
    boolean saveTravellerDetails(TravellerDto dto);
}
