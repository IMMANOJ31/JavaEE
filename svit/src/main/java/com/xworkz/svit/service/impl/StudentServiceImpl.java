package com.xworkz.svit.service.impl;

import com.xworkz.svit.dto.StudentDto;
import com.xworkz.svit.repo.StudentRepo;
import com.xworkz.svit.repo.impl.StudentRepoImpl;
import com.xworkz.svit.service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentRepo studentRepo;

    public StudentServiceImpl(){
        studentRepo = new StudentRepoImpl();
    }
    @Override
    public boolean isStudentValid(StudentDto dto) {
        boolean isValidated = false;
        boolean isFullName = false;
        boolean isEmailId = false;
        boolean isMobile = false;
        boolean isCourse = false;
        boolean isDob = false;
        boolean isAddress = false;

        if (dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isFullName = true;
        }
        if (dto.getEmailId() != null && !dto.getEmailId().isEmpty()){
            isEmailId = true;
        }
        if (dto.getPhoneNumber() != null && !dto.getPhoneNumber().isEmpty()){
            isMobile = true;
        }
        if (dto.getCourse() != null && !dto.getCourse().isEmpty()){
            isCourse = true;
        }
        if (dto.getDob() != null && !dto.getDob().isEmpty()){
            isDob = true;
        }
        if (dto.getAddress() != null && !dto.getAddress().isEmpty()){
            isAddress =true;
        }
        if (isFullName && isEmailId && isMobile && isCourse && isDob && isAddress){
            isValidated = studentRepo.saveDetails(dto);
        }
        return isValidated;
    }
}
