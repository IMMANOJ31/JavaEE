package com.passportseva.passportapp.service.impl;

import com.passportseva.passportapp.dto.UserRegistrationDto;
import com.passportseva.passportapp.repositry.UserRegistrationRepo;
import com.passportseva.passportapp.repositry.impl.UserRegistrationRepoImpl;
import com.passportseva.passportapp.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationRepo userRegistrationRepo;

    public UserRegistrationServiceImpl() {
        userRegistrationRepo = new UserRegistrationRepoImpl();
    }

    @Override
    public boolean validateAndSaveUser(UserRegistrationDto dto) {

        boolean userSaved = false;
        boolean isPassportOffice = false;
        boolean isGivenNameValid = false;
        boolean isSurnameValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isLoginId = false;
        boolean isPasswordValid = false;
        boolean isConfirmPassword = false;


        if (!dto.getPassportOffice().isEmpty()) {
            isPassportOffice = true;
        }
        if (dto.getGivenName() != null && !dto.getGivenName().isEmpty()) {
            isGivenNameValid = true;
        }
        if (dto.getSurname() != null && !dto.getSurname().isEmpty()) {
            isSurnameValid = true;
        }
        if (dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDobValid = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmailValid = true;
        }
        if (!dto.getLoginId().isEmpty()) {
            isLoginId = true;
        }
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            isPasswordValid = true;
        }
        if (dto.getConfirmPassword().equals( dto.getPassword()) && !dto.getConfirmPassword().isEmpty()) {
            isConfirmPassword = true;
        }

        if (isPassportOffice && isGivenNameValid && isSurnameValid && isDobValid && isEmailValid && isLoginId && isPasswordValid && isConfirmPassword ) {
            userRegistrationRepo.saveUser(dto);
        }

        return userSaved;
    }
}
