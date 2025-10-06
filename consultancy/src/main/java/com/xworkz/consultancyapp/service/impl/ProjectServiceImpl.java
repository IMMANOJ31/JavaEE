package com.xworkz.consultancyapp.service.impl;

import com.xworkz.consultancyapp.dto.ProjectDto;
import com.xworkz.consultancyapp.repository.ProjectRepository;
import com.xworkz.consultancyapp.repository.impl.ProjectRepositoryImpl;
import com.xworkz.consultancyapp.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
    ProjectRepository projectRepository;

    public ProjectServiceImpl(){
        projectRepository = new ProjectRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveProject(ProjectDto projectDto) {
        boolean isValidatedAndSaved = false;
        boolean isProjectName = false;
        boolean isProjectStartDate = false;
        boolean isProjectType = false;
        boolean isConsultancyName = false;
        boolean isBudget = false;

        if(projectDto.getProjectName() != null && !projectDto.getProjectName().isEmpty()){
            isProjectName = true;
        }

        if(projectDto.getProjectStartDate() != null && !projectDto.getProjectStartDate().isEmpty()){
            isProjectStartDate = true;
        }

        if(projectDto.getProjectType() != null && !projectDto.getProjectType().isEmpty()){
            isProjectType = true;
        }

        if(projectDto.getConsultancyName() != null && !projectDto.getConsultancyName().isEmpty()){
            isConsultancyName = true;
        }

        if(projectDto.getBudget() != 0.0 && projectDto.getBudget() > 0.0){
            isBudget = true;
        }

        if(isProjectName && isProjectStartDate && isProjectType && isConsultancyName && isBudget){
            isValidatedAndSaved = projectRepository.saveProject(projectDto);
        }
        return isValidatedAndSaved;
    }
}
