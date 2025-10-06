package com.xworkz.amazonapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserDto {
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String gender;
    private String email;
}
