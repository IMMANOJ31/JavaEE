package com.xworkz.spotify.repo;

import com.xworkz.spotify.dto.UserDto;

public interface SpotifyRepo {
    boolean saveDetails(UserDto dto);
}
