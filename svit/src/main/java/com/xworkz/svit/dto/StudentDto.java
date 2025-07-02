package com.xworkz.svit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class StudentDto {
    private String fullName;
    private String emailId;
    private String phoneNumber;
    private String course;
    private String dob;
    private String address;
}
