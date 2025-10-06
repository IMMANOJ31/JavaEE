package com.passportseva.passportapp.service;

import com.passportseva.passportapp.dto.UserRegistrationDto;

public interface UserRegistrationService {

    boolean validateAndSaveUser(UserRegistrationDto dto);


}
