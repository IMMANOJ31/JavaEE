package com.xworkz.travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class TravellerDto {
    private String fullName;
    private  String gender;
    private String age;
    private String email;
    private String origin;
    private String destination;
}
