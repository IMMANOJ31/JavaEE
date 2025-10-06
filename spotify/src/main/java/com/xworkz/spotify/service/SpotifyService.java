package com.xworkz.spotify.service;

import com.xworkz.spotify.dto.UserDto;

public interface SpotifyService {
    boolean userValid(UserDto dto);
}
