package com.xworkz.boutiqueapp.service.impl;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;
import com.xworkz.boutiqueapp.repositry.ViewCustomersRepo;
import com.xworkz.boutiqueapp.repositry.impl.ViewCustomersRepoImpl;
import com.xworkz.boutiqueapp.service.ViewCustomersService;

public class ViewCustomersServiceImpl implements ViewCustomersService {

    ViewCustomersRepo viewCustomersRepo;
    public ViewCustomersServiceImpl(){
        viewCustomersRepo = new ViewCustomersRepoImpl();
    }

    @Override
    public BoutiqueDto[] viewCustomers() {
        return viewCustomersRepo.viewCustomers();
    }
}
