package com.weather.report;


import com.weather.report.dto.WeatherReportDto;
import com.weather.report.service.WeatherReportService;
import com.weather.report.service.impl.WeatherReportServiceImpl;

public class WeatherReportRunner {

    static WeatherReportService weatherReportService;

    public static void main(String[] args) {
        WeatherReportDto reportDto = new WeatherReportDto();
        reportDto.setLocation("Canada");
        reportDto.setDate("2025-06-19");
        reportDto.setWeatherCondition("rainy");
        reportDto.setTemperatureCelsius(27.5);
        reportDto.setWindSpeedKph(14.2);

        weatherReportService = new WeatherReportServiceImpl();
        weatherReportService.validateAndSaveReport(reportDto);
        System.out.println("Weather Report Saved...");

        weatherReportService.updateTemperatureByReportId(1, 29.0);
        System.out.println("Temperature Updated...");

        weatherReportService.deleteReportById(1);
        System.out.println("Weather Report Deleted...");
    }
}