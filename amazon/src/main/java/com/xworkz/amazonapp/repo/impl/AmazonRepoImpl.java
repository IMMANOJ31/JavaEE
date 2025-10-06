package com.xworkz.amazonapp.repo.impl;

import com.xworkz.amazonapp.dto.UserDto;
import com.xworkz.amazonapp.repo.AmazonRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AmazonRepoImpl implements AmazonRepo {
    @Override
    public boolean saveUser(UserDto dto) {
        boolean isUserSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("insert into user_details(first_name,last_name,phone_number,gender,email) values(?,?,?,?,?)");
            statement.setString(1,dto.getFirstName());
            statement.setString(2, dto.getLastName());
            statement.setLong(3,dto.getPhoneNumber());
            statement.setString(4, dto.getGender());
            statement.setString(5, dto.getEmail());
            int noOfRowsAffected = statement.executeUpdate();
            if (noOfRowsAffected > 0){
                isUserSaved = true;
            }
            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return isUserSaved;
    }
}
