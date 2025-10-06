package com.passportseva.passportapp.repositry.impl;

import com.passportseva.passportapp.dto.UserRegistrationDto;
import com.passportseva.passportapp.repositry.UserRegistrationRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegistrationRepoImpl implements UserRegistrationRepo {
    @Override
    public boolean saveUser(UserRegistrationDto dto) {
        boolean userRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/passport_seva_registration","root","Rajashree@31");
            Statement statement = conn.createStatement();
            int noOfRowsAffected   = statement.executeUpdate("insert into passport_app (passport_Office, given_name,surname,dob, email,login_id,password,confirm_password  ) values("+
                    "'"+dto.getPassportOffice()+"'," +
                    "'"+dto.getGivenName()+"'," +
                    "'"+dto.getSurname()+"'," +
                    "'"+dto.getDob()+"'," +
                    "'"+dto.getEmail()+"'," +
                    "'"+dto.getLoginId()+"'," +
                    "'"+dto.getPassword()+"'," +
                    "'"+dto.getConfirmPassword()+
                    "')");
            if(noOfRowsAffected > 0)
                userRegistered = true;
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        System.out.println(dto);
        return userRegistered;
    }
}
