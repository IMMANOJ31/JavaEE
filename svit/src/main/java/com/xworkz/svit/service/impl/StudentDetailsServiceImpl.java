package com.xworkz.svit.service.impl;

import com.xworkz.svit.dto.StudentDto;
import com.xworkz.svit.repo.StudentDetailsRepo;
import com.xworkz.svit.repo.impl.StudentDetailsRepoImpl;
import com.xworkz.svit.service.StudentDetailsService;

public class StudentDetailsServiceImpl implements StudentDetailsService {
    StudentDetailsRepo studentDetailsRepo;

    public StudentDetailsServiceImpl(){
        studentDetailsRepo = new StudentDetailsRepoImpl();
    }
    @Override
    public StudentDto[] fetchAllDetails() {
        return studentDetailsRepo.details();
    }
}
