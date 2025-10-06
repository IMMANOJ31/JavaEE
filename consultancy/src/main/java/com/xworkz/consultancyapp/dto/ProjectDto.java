package com.xworkz.consultancyapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private String projectName;
    private String projectStartDate;
    private String projectType;
    private String consultancyName;
    private double budget;
}
