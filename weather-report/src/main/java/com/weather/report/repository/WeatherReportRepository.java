package com.weather.report.repository;

import com.weather.report.dto.WeatherReportDto;

public interface WeatherReportRepository {
    boolean saveReport(WeatherReportDto reportDto);
    boolean updateTemperatureByReportId(int reportId, double updatedTemp);
    boolean deleteReportById(int reportId);
}
