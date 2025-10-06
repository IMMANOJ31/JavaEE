package com.xworkz.form.service;

import com.xworkz.form.dto.UserDto;

public interface RegisterUserService {

    boolean validateAndSaveUser(UserDto dto);
}
