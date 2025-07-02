package com.xworkz.amazonapp.repo;

import com.xworkz.amazonapp.dto.UserDto;

public interface GetAllUsersRepo {

    UserDto[] fetchAllUsersDetails();
}
