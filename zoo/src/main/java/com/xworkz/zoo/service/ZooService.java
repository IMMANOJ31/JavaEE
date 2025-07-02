package com.xworkz.zoo.service;

import com.xworkz.zoo.dto.ZooDto;

public interface ZooService {

    boolean isZooValid(ZooDto zooDto);
    boolean isZooUpdated(int animalId,String animalBlock);
    boolean isZooDeleted(int animalId);
}
