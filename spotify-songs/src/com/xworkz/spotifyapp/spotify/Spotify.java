package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.dto.SongDto;


public interface Spotify {

    boolean addSong(SongDto dto);

    void getAllSongs();

    String getArtistBySongName(String songName);

    int getDurationBySongName(String songName);

    String getGenreBySongName(String songName);

    String getSongNameByAlbumOrArtist(String albumOrArtist);

    boolean updateSongDurationById(int id, int newDuration);

    String getAlbumBySongName(String songName);
}

