package com.passportseva.passportapp.repositry;

import com.passportseva.passportapp.dto.UserRegistrationDto;

public interface UserRegistrationRepo {

    boolean saveUser(UserRegistrationDto dto);
}
