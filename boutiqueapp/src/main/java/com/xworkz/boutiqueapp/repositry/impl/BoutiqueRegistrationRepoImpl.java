package com.xworkz.boutiqueapp.repositry.impl;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;
import com.xworkz.boutiqueapp.repositry.BoutiqueRegistrationRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BoutiqueRegistrationRepoImpl implements BoutiqueRegistrationRepo {

    @Override
    public boolean saveUserDetails(BoutiqueDto dto) {
        boolean saveUser = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Rajashree@31");
            Statement statement = con.createStatement();
            int noOfRowsAffected = statement.executeUpdate("insert into botique_user (fullName, email, mobile, password, style ) values("+
                    "'"+dto.getFullName()+"'," +
                    "'"+dto.getEmail()+"'," +
                    "'"+dto.getMobile()+"'," +
                    "'"+dto.getPassword()+"'," +
                    "'"+dto.getStyle()+
                    "')");
            if(noOfRowsAffected > 0){
                saveUser = true;
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        System.out.println(dto);
        return saveUser;
    }
}
