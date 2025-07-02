package com.xworkz.consultancyapp.repository.impl;

import com.xworkz.consultancyapp.dto.ProjectDto;
import com.xworkz.consultancyapp.repository.ProjectRepository;

import java.sql.*;

public class ProjectRepositoryImpl implements ProjectRepository {
    @Override
    public boolean saveProject(ProjectDto projectDto) {
        boolean isSaved = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root", "Mallu@2K3");
            Statement statement = connection.createStatement();
            String inserData = "insert into project_details (project_name, project_start_date, project_type, consultancy_name, budget) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(inserData);
            preparedStatement.setString(1, projectDto.getProjectName());
            preparedStatement.setString(2, projectDto.getProjectStartDate());
            preparedStatement.setString(3, projectDto.getProjectType());
            preparedStatement.setString(4, projectDto.getConsultancyName());
            preparedStatement.setDouble(5,projectDto.getBudget());
            preparedStatement.executeUpdate();


        }catch (ClassNotFoundException | SQLException exception){
            exception.printStackTrace();
        }

        System.out.println(projectDto);

        return isSaved;
    }
}
