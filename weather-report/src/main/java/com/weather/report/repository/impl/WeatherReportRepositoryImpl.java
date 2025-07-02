package com.weather.report.repository.impl;


import com.weather.report.dto.WeatherReportDto;
import com.weather.report.repository.WeatherReportRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WeatherReportRepositoryImpl implements WeatherReportRepository {

    @Override
    public boolean saveReport(WeatherReportDto reportDto) {
        boolean isSaved = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO weather_reports (location, date, weather_condition, temperature_celsius, wind_speed_kph) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, reportDto.getLocation());
            preparedStatement.setString(2, reportDto.getDate());
            preparedStatement.setString(3, reportDto.getWeatherCondition());
            preparedStatement.setDouble(4, reportDto.getTemperatureCelsius());
            preparedStatement.setDouble(5, reportDto.getWindSpeedKph());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(reportDto);
        return isSaved;
    }

    @Override
    public boolean updateTemperatureByReportId(int reportId, double updatedTemp) {
        boolean isUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE weather_reports SET temperature_celsius=? WHERE report_id=?");
            preparedStatement.setDouble(1, updatedTemp);
            preparedStatement.setInt(2, reportId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteReportById(int reportId) {
        boolean isDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM weather_reports WHERE report_id=?");
            preparedStatement.setInt(1, reportId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}
