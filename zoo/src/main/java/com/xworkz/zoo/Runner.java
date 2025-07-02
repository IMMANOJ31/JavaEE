package com.xworkz.zoo;

import com.xworkz.zoo.dto.ZooDto;
import com.xworkz.zoo.service.ZooService;
import com.xworkz.zoo.service.impl.ZooServiceImpl;

public class Runner {
    static ZooService zooService;
    public static void main(String[] args) {
        ZooDto dto = new ZooDto();
        dto.setAnimalId(1);
        dto.setAnimalName("Chinmayi");
        dto.setAnimalAge(22);
        dto.setAnimalGender("Female");
        dto.setAnimalBlock("A1");

        ZooDto dto1 = new ZooDto();
        dto1.setAnimalId(2);
        dto1.setAnimalName("Yemme");
        dto1.setAnimalAge(22);
        dto1.setAnimalGender("Female");
        dto1.setAnimalBlock("Y1");

        zooService = new ZooServiceImpl();
       // zooService.isZooValid(dto);
        //zooService.isZooValid(dto1);
       //zooService.isZooUpdated(1,"D5");
        zooService.isZooDeleted(1);

    }
}
