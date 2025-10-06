package com.xworkz.spotify.repo.impl;

import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.repo.SpotifyRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpotifyRepoImpl implements SpotifyRepo {
    @Override
    public boolean saveDetails(UserDto dto) {
        boolean isSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("insert into spotify_user_details (full_name,email,password,confirm_password) values (?,?,?,?)");
            statement.setString(1,dto.getFullName());
            statement.setString(2,dto.getEmail());
            statement.setString(3, dto.getPassword());
            statement.setString(4, dto.getConfirmPassword());

            int noOfRowsEffected = statement.executeUpdate();
            if (noOfRowsEffected > 0){
                isSaved = true;
            }
            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return isSaved;
    }
}
