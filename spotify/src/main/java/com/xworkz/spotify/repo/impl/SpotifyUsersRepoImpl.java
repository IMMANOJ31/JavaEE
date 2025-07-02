package com.xworkz.spotify.repo.impl;

import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.repo.SpotifyUsersRepo;

import java.sql.*;

public class SpotifyUsersRepoImpl implements SpotifyUsersRepo {
    UserDto userDtos[];
    int index;
    @Override
    public UserDto[] fetchAllUserDetails() {
        int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("select * from spotify_user_details");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                count++;
            }
            userDtos = new UserDto[count];
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                UserDto dto = new UserDto();
                dto.setFullName(resultSet.getString(2));
                dto.setEmail(resultSet.getString(3));
                dto.setPassword(resultSet.getString(4));
                dto.setConfirmPassword(resultSet.getString(5));
                userDtos[index++] = dto;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException f){
            f.printStackTrace();
        }
        return userDtos;
    }
}
