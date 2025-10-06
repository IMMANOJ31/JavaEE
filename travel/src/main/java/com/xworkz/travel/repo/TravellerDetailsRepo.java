package com.xworkz.travel.repo;

import com.xworkz.travel.dto.TravellerDto;

public interface TravellerDetailsRepo {
    TravellerDto[] fetchTravellerDetails();
}
