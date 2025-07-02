package com.xworkz.spotify.service.impl;

import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.repo.SpotifyRepo;
import com.xworkz.spotify.repo.impl.SpotifyRepoImpl;
import com.xworkz.spotify.service.SpotifyService;

public class SpotifyServiceImpl implements SpotifyService {

    SpotifyRepo spotifyRepo;

    public  SpotifyServiceImpl(){
        spotifyRepo = new SpotifyRepoImpl();
    }
    @Override
    public boolean userValid(UserDto dto) {
        boolean isValid = false;
        boolean isFullName = false;
        boolean isEmail = false;
        boolean isPassword = false;
        boolean isCPassword = false;

        if (dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isFullName = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmail = true;
        }
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPassword = true;
        }
        if (dto.getConfirmPassword() != null && !dto.getConfirmPassword().isEmpty()){
            isCPassword = true;
        }

        if (isFullName && isEmail && isPassword && isCPassword){
            isValid = spotifyRepo.saveDetails(dto);
        }
        return isValid;
    }
}
