package com.xworkz.hospitalapp.repositry.impl;

import com.xworkz.hospitalapp.dto.HospitalDto;
import com.xworkz.hospitalapp.repositry.HospitalRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRepoImpl implements HospitalRepo {
    @Override
    public boolean saveHospitalDetails(HospitalDto dto) {
        boolean isHospitalDetailsSaved = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Rajashree@31");
            Statement statement = conn.createStatement();
            int noOfRowsAffected = statement.executeUpdate("insert into hospital_details (hospital_id, hospital_name, no_of_patients) values ("
                    +"'"+dto.getHospitalId()+"',"+
                    "'"+dto.getHospitalName()+"',"+
                    "'"+dto.getNoOfPatients()+"')");

            if(noOfRowsAffected >0){
                isHospitalDetailsSaved = true;
            }
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        System.out.println(dto);
        return isHospitalDetailsSaved;
    }
}
