package com.xworkz.boutiqueapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoutiqueDto {

    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private String style;
}
