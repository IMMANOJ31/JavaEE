package com.xworkz.zoo.service.impl;

import com.xworkz.zoo.dto.ZooDto;
import com.xworkz.zoo.repo.ZooRepo;
import com.xworkz.zoo.repo.impl.ZooRepoImpl;
import com.xworkz.zoo.service.ZooService;


public class ZooServiceImpl implements ZooService {
    ZooRepo zooRepo;

    public ZooServiceImpl(){
        zooRepo = new ZooRepoImpl();
    }
    @Override
    public boolean isZooValid(ZooDto zooDto) {
        boolean isValid = false;
        boolean isId = false;
        boolean isName = false;
        boolean isAge = false;
        boolean isGender = false;
        boolean isBlock = false;

        if (zooDto.getAnimalId() != 0){
            isId = true;
        }
        if (zooDto.getAnimalName() != null && !zooDto.getAnimalName().isEmpty()){
            isName = true;
        }
        if (zooDto.getAnimalAge() != 0){
            isAge = true;
        }
        if (zooDto.getAnimalGender() != null && !zooDto.getAnimalGender().isEmpty()){
            isGender = true;
        }
        if (zooDto.getAnimalBlock() != null && !zooDto.getAnimalBlock().isEmpty()){
            isBlock = true;
        }
        if (isId && isName && isAge && isGender && isBlock){
            isValid = zooRepo.saveZooDetails(zooDto);
        }
        return isValid;
    }

    @Override
    public boolean isZooUpdated(int animalId, String animalBlock) {
        boolean isUpdated = false;
        if (animalId != 0 && animalBlock != null && !animalBlock.isEmpty()){
            isUpdated = zooRepo.updatedZooDetails(animalId, animalBlock);
        }
        return isUpdated;
    }

    @Override
    public boolean isZooDeleted(int animalId) {
        boolean isDeleted  = false;
        if (animalId != 0){
            isDeleted = zooRepo.deleteZooDetails(animalId);
        }
        return isDeleted;
    }
}
