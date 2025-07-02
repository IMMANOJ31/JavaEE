package com.xworkz.travel.service.impl;

import com.xworkz.travel.dto.TravellerDto;
import com.xworkz.travel.repo.TravellerRepo;
import com.xworkz.travel.repo.impl.TravellerRepoImpl;
import com.xworkz.travel.service.TravellerService;

public class TravellerServiceImpl implements TravellerService {

    TravellerRepo travellerRepo;

    public  TravellerServiceImpl(){
        travellerRepo = new TravellerRepoImpl();
    }
    @Override
    public boolean isTraveller(TravellerDto dto) {
        boolean isValid = false;
        boolean isFullName = false;
        boolean isGender = false;
        boolean isAge = false;
        boolean isEmail = false;
        boolean isOrigin = false;
        boolean isDest = false;

        if (dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isFullName = true;
        }
        if (dto.getGender() != null && !dto.getGender().isEmpty()){
            isGender = true;
        }
        if (dto.getAge() != null && !dto.getAge().isEmpty()){
            isAge = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmail = true;
        }
        if (dto.getOrigin() != null && !dto.getOrigin().isEmpty()){
            isOrigin = true;
        }
        if (dto.getDestination() != null && !dto.getDestination().isEmpty()){
            isDest = true;
        }

        if (isFullName && isGender && isAge && isEmail && isOrigin && isDest){
            isValid = travellerRepo.saveTravellerDetails(dto);
        }
        return isValid;
    }
}
