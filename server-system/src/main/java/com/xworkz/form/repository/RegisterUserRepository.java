package com.xworkz.form.repository;

import com.xworkz.form.dto.UserDto;

public interface RegisterUserRepository {

    boolean saveUser(UserDto dto);

}