package com.xworkz.form.service.impl;

import com.xworkz.form.dto.UserDto;
import com.xworkz.form.repository.GetAllUsersRepository;
import com.xworkz.form.repository.impl.GetAllUsersRepositoryImpl;
import com.xworkz.form.service.GetAllUsersService;

public class GetAllUsersServiceImpl implements GetAllUsersService {

    GetAllUsersRepository getAllUsersRepository;

    public GetAllUsersServiceImpl(){
        getAllUsersRepository = new GetAllUsersRepositoryImpl();
    }

    @Override
    public UserDto[] getAllUsers() {
        return getAllUsersRepository.getAllUsers();
    }
}
