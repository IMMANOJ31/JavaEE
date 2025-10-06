package com.xworkz.amazonapp.repo.impl;

import com.xworkz.amazonapp.dto.UserDto;
import com.xworkz.amazonapp.repo.GetAllUsersRepo;

import java.sql.*;

public class GetAllUsersRepoImpl implements GetAllUsersRepo {
    UserDto userDtos[];
    int index;
    @Override
    public UserDto[] fetchAllUsersDetails() {
        int count = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("select * from user_details");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                count++;
            }
            userDtos = new UserDto[count];
            System.out.println("Just init size for userDtos array");
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println("Data collection");
                UserDto dto = new UserDto();
                dto.setFirstName(resultSet.getString(2));
                dto.setLastName(resultSet.getString(3));
                dto.setPhoneNumber(resultSet.getLong(4));
                dto.setGender(resultSet.getString(5));
                dto.setEmail(resultSet.getString(6));
                userDtos[index++] = dto;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException r){
            r.printStackTrace();
        }
        return userDtos;
    }
}
