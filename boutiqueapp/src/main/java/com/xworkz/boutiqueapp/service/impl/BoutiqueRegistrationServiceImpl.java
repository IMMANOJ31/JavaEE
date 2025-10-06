package com.xworkz.boutiqueapp.service.impl;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;
import com.xworkz.boutiqueapp.repositry.BoutiqueRegistrationRepo;
import com.xworkz.boutiqueapp.repositry.impl.BoutiqueRegistrationRepoImpl;
import com.xworkz.boutiqueapp.service.BoutiqueRegistrationService;

public class BoutiqueRegistrationServiceImpl implements BoutiqueRegistrationService {

    BoutiqueRegistrationRepo repo ;

    public BoutiqueRegistrationServiceImpl(){
        repo = new BoutiqueRegistrationRepoImpl();
    }


    @Override
    public boolean validateAndSaveUser(BoutiqueDto dto) {
        boolean isValidated = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isMobileValid = false;
        boolean isPasswordValid = false;
        boolean isStyleValid = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isFullNameValid = true;
        }
        if(dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmailValid = true;
        }
        if(dto.getMobile() != null && !dto.getMobile().isEmpty()){
            isMobileValid = true;
        }
        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPasswordValid = true;
        }
        if(dto.getStyle() != null && !dto.getStyle().isEmpty()){
            isStyleValid = true;
        }
        if(isFullNameValid && isEmailValid && isMobileValid && isPasswordValid && isStyleValid) {
            isValidated = repo.saveUserDetails(dto);
        }

        return isValidated;
    }
}
