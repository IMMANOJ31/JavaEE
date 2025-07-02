package com.xworkz.hospitalapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDto {

    private int hospitalId;
    private String hospitalName;
    private int noOfPatients;
}
