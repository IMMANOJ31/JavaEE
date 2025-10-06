package com.xworkz.svit.repo.impl;

import com.xworkz.svit.dto.StudentDto;
import com.xworkz.svit.repo.StudentDetailsRepo;

import java.sql.*;

public class StudentDetailsRepoImpl implements StudentDetailsRepo {

    StudentDto studentDtos[];
    int index;
    @Override
    public StudentDto[] details() {
        int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/svit","root","Manu@Xwoorkz");
            PreparedStatement statement = connection.prepareStatement("select * from student_details");
            ResultSet resultSet =  statement.executeQuery();
            while (resultSet.next()){
                count++;
            }
            studentDtos = new StudentDto[count];
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                StudentDto dto = new StudentDto();
                dto.setFullName(resultSet.getString(2));
                dto.setEmailId(resultSet.getString(3));
                dto.setPhoneNumber(resultSet.getString(4));
                dto.setCourse(resultSet.getString(5));
                dto.setDob(resultSet.getString(6));
                dto.setAddress(resultSet.getString(7));
                studentDtos[index++] = dto;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException g){
            g.printStackTrace();
        }
        return  studentDtos;
    }
}
