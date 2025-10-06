package com.weather.report.service;

import com.weather.report.dto.WeatherReportDto;

public interface WeatherReportService {
    boolean validateAndSaveReport(WeatherReportDto reportDto);
    boolean updateTemperatureByReportId(int reportId, double updatedTemp);
    boolean deleteReportById(int reportId);
}