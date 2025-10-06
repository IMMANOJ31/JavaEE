package com.xworkz.pg.repo.impl;

import com.xworkz.pg.dto.GuestDto;
import com.xworkz.pg.repo.GuestRepo;

import java.sql.*;

public class GuestRepoImpl implements GuestRepo {
    @Override
    public boolean saveGuestDetails(GuestDto guestDto) {
        boolean isSaved = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pg","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("insert into mens_details(guest_id,guest_name,guest_age,guest_room_number)values(?,?,?,?)");
            statement.setInt(1,guestDto.getGuestId());
            statement.setString(2,guestDto.getGuestName());
            statement.setInt(3,guestDto.getGuestAge());
            statement.setInt(4,guestDto.getGuestRoomNumber());
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

    @Override
    public boolean updateGuestDetails(int guestId, int guestRoomNumber) {
        boolean isUpdated = false;
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pg","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("update mens_details set guest_room_number = ? where guest_id = ?");
            statement.setInt(1,guestRoomNumber);
            statement.setInt(2,guestId);
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
    public boolean deleteGuestDetails(int guestId) {
        boolean isDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pg","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("delete from mens_details where guest_id = ?");
            statement.setInt(1,guestId);
            int noOfRowsAffected = statement.executeUpdate();
            if (noOfRowsAffected > 0){
                isDeleted = true;
            }
            statement.close();
            connection.close();

        }catch (SQLException g){
            g.printStackTrace();
        }
        return  isDeleted;
    }

    @Override
    public GuestDto fetchGuestDetails(int guestId) {
        GuestDto guestDto = new GuestDto();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pg","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("select * from mens_details where guest_id = ?");
            statement.setInt(1,guestId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                guestDto.setGuestId(resultSet.getInt("guest_id"));
                guestDto.setGuestName(resultSet.getString("guest_name"));
                guestDto.setGuestAge(resultSet.getInt("guest_age"));
                guestDto.setGuestRoomNumber(resultSet.getInt("guest_room_number"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (SQLException d){
            d.printStackTrace();
        }
        return guestDto;
    }
}
