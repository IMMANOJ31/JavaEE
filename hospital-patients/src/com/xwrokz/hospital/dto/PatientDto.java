package com.xwrokz.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {


        private int id;
        private String name;
        private int age;
        private String address;
        private String disease;
        private String doctorAssigned;
        private long phoneNumber;
        private String email;


}


