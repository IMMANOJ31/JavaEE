package com.xworkz.hospitalapp.service;

import com.xworkz.hospitalapp.dto.HospitalDto;

public interface HospitalService {

    boolean validateAndSave(HospitalDto dto);

}
