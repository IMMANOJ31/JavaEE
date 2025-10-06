package com.xworkz.zoo.repo.impl;

import com.xworkz.zoo.dto.ZooDto;
import com.xworkz.zoo.repo.ZooRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ZooRepoImpl implements ZooRepo {
    @Override
    public boolean saveZooDetails(ZooDto zooDto) {
        boolean isValid = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("insert into zoo_details(animal_id,animal_name,animal_gender,animal_age,animal_block)values(?,?,?,?,?)");
            statement.setInt(1,zooDto.getAnimalId());
            statement.setString(2,zooDto.getAnimalName());
            statement.setString(3, zooDto.getAnimalGender());
            statement.setInt(4,zooDto.getAnimalAge());
            statement.setString(5, zooDto.getAnimalBlock());

            int noOfRowsEffected = statement.executeUpdate();
            if (noOfRowsEffected > 0){
                isValid = true;
            }
            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return isValid;
    }

    @Override
    public boolean updatedZooDetails(int animalId, String animalBlock) {
        boolean isUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("update zoo_details set animal_block = ? where animal_id = ?");
            statement.setString(1, animalBlock);
            statement.setInt(2,animalId);
            int noOfRowsEffected = statement.executeUpdate();
            if (noOfRowsEffected > 0){
                isUpdated = true;
            }
            statement.close();
            connection.close();
        }catch (SQLException f){
            f.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteZooDetails(int animalId) {
        boolean isDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("delete from zoo_details where animal_id = ?");
            statement.setInt(1, animalId);
            int noOfRowsEffected = statement.executeUpdate();
            if (noOfRowsEffected > 0){
                isDeleted = true;
            }
            statement.close();
            connection.close();
        }catch (SQLException g){
            g.printStackTrace();
        }
        return isDeleted;

    }
}
