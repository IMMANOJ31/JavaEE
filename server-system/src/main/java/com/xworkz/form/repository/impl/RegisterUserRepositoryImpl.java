package com.xworkz.form.repository.impl;

import com.xworkz.form.dto.UserDto;
import com.xworkz.form.repository.RegisterUserRepository;

import java.sql.*;

public class RegisterUserRepositoryImpl implements RegisterUserRepository {
public  RegisterUserRepositoryImpl(){
}
        @Override
        public boolean saveUser(UserDto dto) {
            boolean isUserSavd = false;
            try {
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Mallu@2K3");
                PreparedStatement ps  = conn.prepareStatement("INSERT INTO user_table (first_name, last_name, gender, dob, password, confirm_password) VALUES (?, ?, ?, ?, ?, ?)");
                ps.setString(1, dto.getFirstName());
                ps.setString(2, dto.getLastName());
                ps.setString(3, dto.getGender());
                ps.setString(4, dto.getDob());
                ps.setString(5, dto.getPassword());
                ps.setString(6, dto.getConfirmPassword());
                ps.executeUpdate();

                ps.close();
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
            System.out.println(dto);

            return isUserSavd;
        }
}