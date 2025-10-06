package com.xworkz.hospitalapp.service.impl;

import com.xworkz.hospitalapp.dto.HospitalDto;
import com.xworkz.hospitalapp.repositry.HospitalRepo;
import com.xworkz.hospitalapp.repositry.impl.HospitalRepoImpl;
import com.xworkz.hospitalapp.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {

    HospitalRepo hospitalRepo;
    public HospitalServiceImpl(){
        hospitalRepo = new HospitalRepoImpl();
    }

    @Override
    public boolean validateAndSave(HospitalDto dto) {
        boolean isValidated = false;
        boolean isHospitalIdValid = false;
        boolean isHospitalNameValid = false;
        boolean isNoOfPatientsValid = false;

        if(dto.getHospitalId() != 0){
            isHospitalIdValid = true;
        }
        if(dto.getHospitalName() != null && !dto.getHospitalName().isEmpty()){
            isHospitalNameValid = true;
        }
        if(dto.getNoOfPatients() != 0){
            isNoOfPatientsValid = true;
        }
        if(isHospitalIdValid && isHospitalNameValid && isNoOfPatientsValid){
            isValidated = hospitalRepo.saveHospitalDetails(dto);
        }



        return isValidated;
    }
}
