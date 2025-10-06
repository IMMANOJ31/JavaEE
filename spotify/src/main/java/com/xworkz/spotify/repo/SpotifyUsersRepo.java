package com.xworkz.spotify.repo;

import com.xworkz.spotify.dto.UserDto;

public interface SpotifyUsersRepo {
    UserDto[] fetchAllUserDetails();
}
