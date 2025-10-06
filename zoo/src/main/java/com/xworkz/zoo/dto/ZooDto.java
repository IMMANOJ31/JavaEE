package com.xworkz.zoo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ZooDto {

    private  int animalId;
    private String animalName;
    private String animalGender;
    private int animalAge;
    private String animalBlock;
}
