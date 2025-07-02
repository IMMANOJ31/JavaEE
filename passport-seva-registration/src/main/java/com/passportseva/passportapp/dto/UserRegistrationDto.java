package com.passportseva.passportapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDto {

    private String passportOffice;
    private String givenName;
    private String surname;
    private String dob;
    private String email;
    private String loginId;
    private String password;
    private String confirmPassword;

}
