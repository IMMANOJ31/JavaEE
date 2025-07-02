package com.xworkz.boutiqueapp.repositry.impl;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;
import com.xworkz.boutiqueapp.repositry.ViewCustomersRepo;

import java.sql.*;

public class ViewCustomersRepoImpl implements ViewCustomersRepo {

    BoutiqueDto[] userDto;
    int index;

    @Override
    public BoutiqueDto[] viewCustomers() {
        int count = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from botique_user ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                count++;
            }
            userDto = new BoutiqueDto[count];
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                BoutiqueDto userDtos = new BoutiqueDto();
                userDtos.setFullName(resultSet.getString("fullName"));
                userDtos.setEmail(resultSet.getString("email"));
                userDtos.setMobile(resultSet.getString("mobile"));
                userDtos.setPassword(resultSet.getString("password"));
                userDtos.setStyle(resultSet.getString("style"));
                userDto[index++] = userDtos;
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();

        }
        System.out.println(userDto);
        return userDto;
    }
}
