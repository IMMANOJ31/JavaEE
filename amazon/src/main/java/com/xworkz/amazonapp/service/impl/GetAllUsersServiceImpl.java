package com.xworkz.amazonapp.service.impl;

import com.xworkz.amazonapp.dto.UserDto;
import com.xworkz.amazonapp.repo.GetAllUsersRepo;
import com.xworkz.amazonapp.repo.impl.GetAllUsersRepoImpl;
import com.xworkz.amazonapp.service.GetAllUsersService;

public class GetAllUsersServiceImpl implements GetAllUsersService {

    GetAllUsersRepo getAllUsersRepo;

    public GetAllUsersServiceImpl(){
        getAllUsersRepo = new GetAllUsersRepoImpl();
    }

    @Override
    public UserDto[] getAllUser() {
        return getAllUsersRepo.fetchAllUsersDetails();
    }
}
