package com.xworkz.travel.repo.impl;

import com.xworkz.travel.dto.TravellerDto;
import com.xworkz.travel.repo.TravellerRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TravellerRepoImpl implements TravellerRepo {
    @Override
    public boolean saveTravellerDetails(TravellerDto dto) {
        boolean isSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("insert into travel_details(full_name,gender,age,email,origin,destination) values (?,?,?,?,?,?)");
            statement.setString(1, dto.getFullName());
            statement.setString(2, dto.getGender());
            statement.setString(3, dto.getAge());
            statement.setString(4, dto.getEmail());
            statement.setString(5, dto.getOrigin());
            statement.setString(6, dto.getDestination());

            int noOfRows = statement.executeUpdate();

            if (noOfRows > 0){
                isSaved = true;
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return isSaved;
    }
}
