package com.xworkz.spotify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserDto {
    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;
}
