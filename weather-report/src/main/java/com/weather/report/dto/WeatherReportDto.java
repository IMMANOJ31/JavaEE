package com.weather.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherReportDto {
    private String location;
    private String date;
    private String weatherCondition;
    private double temperatureCelsius;
    private double windSpeedKph;
}
