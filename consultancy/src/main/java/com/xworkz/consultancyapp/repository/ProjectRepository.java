package com.xworkz.consultancyapp.repository;

import com.xworkz.consultancyapp.dto.ProjectDto;

public interface ProjectRepository {
    boolean saveProject(ProjectDto projectDto);
}
