package com.xwrokz.hospital.hospital;

import com.xwrokz.hospital.dto.PatientDto;

public interface Hospital {

        boolean admitPatient(PatientDto dto);  // Similar to addTrainee

        void getAllPatients();

        int getPatientAgeByName(String name);

        String getPatientAddressByName(String name);

        String getPatientNameByPhoneNumberOrEmail(String phoneOrEmail);

        boolean updatePatientAgeById(int id, int newAge);

        String getDiseaseByPatientName(String name);

        String getDoctorAssignedByPatientName(String name);

}
