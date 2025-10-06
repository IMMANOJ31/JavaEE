package com.xworkz.spotify.service.impl;

import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.repo.SpotifyUsersRepo;
import com.xworkz.spotify.repo.impl.SpotifyUsersRepoImpl;
import com.xworkz.spotify.service.SpotifyUsers;

public class SpotifyUsersImpl implements SpotifyUsers {

    SpotifyUsersRepo spotifyRepo;

    public SpotifyUsersImpl(){
        spotifyRepo = new SpotifyUsersRepoImpl();
    }
    @Override
    public UserDto[] getAllUsersDetails() {
        return spotifyRepo.fetchAllUserDetails();
    }
}
