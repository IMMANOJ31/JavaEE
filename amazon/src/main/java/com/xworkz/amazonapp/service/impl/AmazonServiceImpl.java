package com.xworkz.amazonapp.service.impl;

import com.xworkz.amazonapp.dto.UserDto;
import com.xworkz.amazonapp.repo.AmazonRepo;
import com.xworkz.amazonapp.repo.impl.AmazonRepoImpl;
import com.xworkz.amazonapp.service.AmazonService;

public class AmazonServiceImpl implements AmazonService {

    AmazonRepo amazonRepo;

    public AmazonServiceImpl(){
        amazonRepo = new AmazonRepoImpl();
    }
    @Override
    public boolean isUserValid(UserDto dto) {
        boolean isUserValidated = false;

        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isPhone = false;
        boolean isEmail = false;
        boolean isGender = false;

        if (dto.getFirstName() != null && !dto.getFirstName().isEmpty()){
            isFirstName = true;
        }
        if (dto.getLastName() != null && !dto.getLastName().isEmpty()){
            isLastName =true;
        }
        if (dto.getPhoneNumber() != 0){
            isPhone = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmail =true;
        }
        if (dto.getGender() != null && !dto.getGender().isEmpty()){
            isGender =true;
        }
        if (isFirstName && isLastName && isPhone && isEmail && isGender){
            isUserValidated = amazonRepo.saveUser(dto);
        }
        return isUserValidated;
    }
}
