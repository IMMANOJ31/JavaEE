package com.xworkz.consultancyapp.service;

import com.xworkz.consultancyapp.dto.ProjectDto;

public interface ProjectService {
    boolean validateAndSaveProject(ProjectDto projectDto);
}
