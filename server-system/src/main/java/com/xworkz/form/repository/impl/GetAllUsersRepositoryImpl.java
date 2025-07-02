package com.xworkz.form.repository.impl;

import com.xworkz.form.dto.UserDto;
import com.xworkz.form.repository.GetAllUsersRepository;

import java.sql.*;

public class GetAllUsersRepositoryImpl implements GetAllUsersRepository {

    UserDto[] userDto;
    int index;

    @Override
    public UserDto[] getAllUsers() {
        int count = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from user_table");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                count++;
            }
            userDto = new UserDto[count];
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                UserDto userDtos = new UserDto();
                userDtos.setFirstName(resultSet.getString("first_name"));
                userDtos.setLastName(resultSet.getString("last_name"));
                userDtos.setGender(resultSet.getString("gender"));
                userDtos.setDob(resultSet.getString("dob"));
                userDtos.setPassword(resultSet.getString("password"));
                userDtos.setConfirmPassword(resultSet.getString("confirm_password"));
                userDto[index++]= userDtos;
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return userDto;
    }
}