package com.xworkz.svit.repo;

import com.xworkz.svit.dto.StudentDto;

public interface StudentRepo {
    boolean saveDetails(StudentDto dto);
}
