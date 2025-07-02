package com.weather.report.service.impl;

import com.weather.report.dto.WeatherReportDto;
import com.weather.report.repository.WeatherReportRepository;
import com.weather.report.repository.impl.WeatherReportRepositoryImpl;
import com.weather.report.service.WeatherReportService;

public class WeatherReportServiceImpl implements WeatherReportService {

    WeatherReportRepository weatherReportRepository;

    public WeatherReportServiceImpl() {
        weatherReportRepository = new WeatherReportRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveReport(WeatherReportDto reportDto) {
        boolean isValidatedAndSaved = false;
        boolean isLocation = false;
        boolean isDate = false;
        boolean isWeatherCondition = false;
        boolean isTemperature = false;
        boolean isWindSpeed = false;

        if (reportDto.getLocation() != null && !reportDto.getLocation().isEmpty()) {
            isLocation = true;
        }
        if (reportDto.getDate() != null && !reportDto.getDate().isEmpty()) {
            isDate = true;
        }
        if (reportDto.getWeatherCondition() != null && !reportDto.getWeatherCondition().isEmpty()) {
            isWeatherCondition = true;
        }
        if (reportDto.getTemperatureCelsius() >= -100 && reportDto.getTemperatureCelsius() <= 100) {
            isTemperature = true;
        }
        if (reportDto.getWindSpeedKph() >= 0) {
            isWindSpeed = true;
        }

        if (isLocation && isDate && isWeatherCondition && isTemperature && isWindSpeed) {
            isValidatedAndSaved = weatherReportRepository.saveReport(reportDto);
        }

        return isValidatedAndSaved;
    }

    @Override
    public boolean updateTemperatureByReportId(int reportId, double updatedTemp) {
        boolean isTemperatureUpdated = false;
        if (reportId > 0 && updatedTemp >= -100 && updatedTemp <= 100) {
            isTemperatureUpdated = weatherReportRepository.updateTemperatureByReportId(reportId, updatedTemp);
        }
        return isTemperatureUpdated;
    }

    @Override
    public boolean deleteReportById(int reportId) {
        boolean isReportDeleted = false;
        if (reportId > 0) {
            isReportDeleted = weatherReportRepository.deleteReportById(reportId);
        }
        return isReportDeleted;
    }
}

