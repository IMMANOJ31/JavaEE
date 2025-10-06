package com.xworkz.travel.repo.impl;

import com.xworkz.travel.dto.TravellerDto;
import com.xworkz.travel.repo.TravellerDetailsRepo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TravellerDetailsRepoImpl implements TravellerDetailsRepo {

    TravellerDto[] travellerDtos;
    int index;
    @Override
    public TravellerDto[] fetchTravellerDetails() {
        int count = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("select * from travel_details");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                count++;
            }
            travellerDtos = new TravellerDto[count];
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                TravellerDto dto = new TravellerDto();
                dto.setFullName(resultSet.getString(2));
                dto.setGender(resultSet.getString(3));
                dto.setAge(resultSet.getString(4));
                dto.setEmail(resultSet.getString(5));
                dto.setOrigin(resultSet.getString(6));
                dto.setDestination(resultSet.getString(7));
                travellerDtos[index++] = dto;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return travellerDtos;
    }
}
