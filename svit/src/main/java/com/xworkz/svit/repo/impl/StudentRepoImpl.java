package com.xworkz.svit.repo.impl;

import com.xworkz.svit.dto.StudentDto;
import com.xworkz.svit.repo.StudentRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepoImpl implements StudentRepo {
    @Override
    public boolean saveDetails(StudentDto dto) {
        boolean isSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/svit","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("insert into student_details(full_name,email_id,mobile_number,course,dob,address) values(?,?,?,?,?,?)");
            statement.setString(1,dto.getFullName());
            statement.setString(2, dto.getEmailId());
            statement.setString(3, dto.getPhoneNumber());
            statement.setString(4, dto.getCourse());
            statement.setString(5, dto.getDob());
            statement.setString(6, dto.getAddress());

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
