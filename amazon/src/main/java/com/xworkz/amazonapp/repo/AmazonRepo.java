package com.xworkz.amazonapp.repo;

import com.xworkz.amazonapp.dto.UserDto;

public interface AmazonRepo {

    boolean saveUser(UserDto dto);
}
