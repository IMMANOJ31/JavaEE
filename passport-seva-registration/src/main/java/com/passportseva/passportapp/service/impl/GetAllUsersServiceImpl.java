package com.passportseva.passportapp.service.impl;

import com.passportseva.passportapp.dto.UserRegistrationDto;
import com.passportseva.passportapp.repositry.GetAllUsersRepo;
import com.passportseva.passportapp.repositry.impl.GetAllUsersRepoImpl;
import com.passportseva.passportapp.service.GetAllUsersService;

public class GetAllUsersServiceImpl implements GetAllUsersService {

    GetAllUsersRepo getAllUsersRepository;

    public GetAllUsersServiceImpl(){
        getAllUsersRepository = new GetAllUsersRepoImpl();
    }

    @Override
    public UserRegistrationDto[] getAllUsers() {
        return getAllUsersRepository.getAllUsers();
    }
}
