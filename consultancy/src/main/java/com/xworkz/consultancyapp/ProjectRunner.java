package com.xworkz.consultancyapp;

import com.xworkz.consultancyapp.dto.ProjectDto;
import com.xworkz.consultancyapp.service.ProjectService;
import com.xworkz.consultancyapp.service.impl.ProjectServiceImpl;

public class ProjectRunner {

    static ProjectService projectService;
    public static void main(String[] args) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setProjectName("Meto");
        projectDto.setProjectStartDate("12-09-2024");
        projectDto.setProjectType("E-Commerce");
        projectDto.setConsultancyName("Inner Peace");
        projectDto.setBudget(150000.00);

        projectService = new ProjectServiceImpl();
        projectService.validateAndSaveProject(projectDto);

        System.out.println("Project Added...");
    }
}
