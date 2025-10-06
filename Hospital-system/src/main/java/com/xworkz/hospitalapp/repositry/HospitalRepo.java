package com.xworkz.hospitalapp.repositry;

import com.xworkz.hospitalapp.dto.HospitalDto;

public interface HospitalRepo {

    boolean saveHospitalDetails(HospitalDto dto);
}
