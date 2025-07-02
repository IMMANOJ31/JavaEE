package com.xworkz.travel.service.impl;

import com.xworkz.travel.dto.TravellerDto;
import com.xworkz.travel.repo.TravellerDetailsRepo;
import com.xworkz.travel.repo.impl.TravellerDetailsRepoImpl;
import com.xworkz.travel.service.TravellerDetailsService;

public class TravellerDetailsServiceImpl implements TravellerDetailsService {

    TravellerDetailsRepo travellerDetailsRepo;

    public TravellerDetailsServiceImpl(){
        travellerDetailsRepo = new TravellerDetailsRepoImpl();
    }
    @Override
    public TravellerDto[] getTravellerDetails() {
        return travellerDetailsRepo.fetchTravellerDetails();
    }
}
