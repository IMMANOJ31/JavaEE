package com.xworkz.zoo.repo;

import com.xworkz.zoo.dto.ZooDto;

public interface ZooRepo {

    boolean saveZooDetails(ZooDto zooDto);
    boolean updatedZooDetails(int animalId, String animalBlock);
    boolean deleteZooDetails(int animalId);
}
