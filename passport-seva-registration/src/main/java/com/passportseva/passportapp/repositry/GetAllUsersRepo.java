package com.passportseva.passportapp.repositry;

import com.passportseva.passportapp.dto.UserRegistrationDto;

public interface GetAllUsersRepo {

    UserRegistrationDto[] getAllUsers();
}
