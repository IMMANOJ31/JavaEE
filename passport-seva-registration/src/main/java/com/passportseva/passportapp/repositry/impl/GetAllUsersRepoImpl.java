package com.passportseva.passportapp.repositry.impl;

import com.passportseva.passportapp.dto.UserRegistrationDto;
import com.passportseva.passportapp.repositry.GetAllUsersRepo;

import java.sql.*;

public class GetAllUsersRepoImpl implements GetAllUsersRepo {

    UserRegistrationDto[] userDto;
    int index;

    @Override
    public UserRegistrationDto[] getAllUsers() {

        int count = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport_seva_registration", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from passport_app");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                count++;
            }
            userDto = new UserRegistrationDto[count];
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                UserRegistrationDto userDtos = new UserRegistrationDto();
                userDtos.setPassportOffice(resultSet.getString("passport_Office"));
                userDtos.setGivenName(resultSet.getString("given_name"));
                userDtos.setSurname(resultSet.getString("surname"));
                userDtos.setDob(resultSet.getString("dob"));
                userDtos.setEmail(resultSet.getString("email"));
                userDtos.setLoginId(resultSet.getString("login_id"));
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
        System.out.println(userDto);
        return userDto;
    }
}
