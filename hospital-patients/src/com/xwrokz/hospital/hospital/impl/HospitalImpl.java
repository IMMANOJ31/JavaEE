package com.xwrokz.hospital.hospital.impl;

import com.xwrokz.hospital.dto.PatientDto;
import com.xwrokz.hospital.hospital.Hospital;



public class HospitalImpl implements Hospital {

    private PatientDto[] patients;
    int index;

    public HospitalImpl(int size) {
        patients = new PatientDto[size];
    }

    @Override
    public boolean admitPatient(PatientDto dto) {
        boolean isAdmitted = false;
        if (dto != null && dto.getId() > 0 && dto.getName() != null) {
            patients[index++] = dto;
            isAdmitted = true;
        } else {
            System.out.println("Invalid patient data!");
        }
        return isAdmitted;
    }

    @Override
    public void getAllPatients() {
        System.out.println("----- List of Patients -----");
        for (PatientDto dto : patients) {
            if (dto != null) {
                System.out.println(dto);
            }
        }
    }

    @Override
    public int getPatientAgeByName(String name) {
        for (PatientDto dto : patients) {
            if (dto != null && dto.getName().equalsIgnoreCase(name)) {
                return dto.getAge();
            }
        }
        System.out.println("Patient not found.");
        return 0;
    }

    @Override
    public String getPatientAddressByName(String name) {
        for (PatientDto dto : patients) {
            if (dto != null && dto.getName().equalsIgnoreCase(name)) {
                return dto.getAddress();
            }
        }
        return null;
    }

    @Override
    public String getPatientNameByPhoneNumberOrEmail(String phoneOrEmail) {
        String patientName = null;
        if (phoneOrEmail != null && !phoneOrEmail.isEmpty()) {
            for (PatientDto patientDto : patients) {
                if(patientDto.getEmail().equalsIgnoreCase(phoneOrEmail)){
                    patientName = patientDto.getName();
                }
                else if (patientDto.getPhoneNumber() == Long.parseLong(phoneOrEmail)) {
                    patientName = patientDto.getName();
                }
            }
        }else System.out.println("Invalid Details!!!!!!!");
        return patientName;
    }

    @Override
    public boolean updatePatientAgeById(int id, int newAge) {
        for (PatientDto dto : patients) {
            if (dto != null && dto.getId() == id) {
                dto.setAge(newAge);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDiseaseByPatientName(String name) {
        for (PatientDto dto : patients) {
            if (dto != null && dto.getName().equalsIgnoreCase(name)) {
                return dto.getDisease();
            }
        }
        return null;
    }

    @Override
    public String getDoctorAssignedByPatientName(String name) {
        for (PatientDto dto : patients) {
            if (dto != null && dto.getName().equalsIgnoreCase(name)) {
                return dto.getDoctorAssigned();
            }
        }
        return null;
    }
}
