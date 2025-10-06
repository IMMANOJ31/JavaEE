package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.dto.HospitalDto;
import com.xworkz.hospitalapp.service.HospitalService;
import com.xworkz.hospitalapp.service.impl.HospitalServiceImpl;

public class HospitalRunner {

    public static void main(String[] args) {

        HospitalDto dto = new HospitalDto();

        dto.setHospitalId(1);
        dto.setHospitalName("Apollo");
        dto.setNoOfPatients(400);

        HospitalService hospitalService = new HospitalServiceImpl();
        hospitalService.validateAndSave(dto);

        System.out.println("Hospital details added!!");
    }
}
