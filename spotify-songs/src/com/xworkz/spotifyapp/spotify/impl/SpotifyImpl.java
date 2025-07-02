package com.xworkz.spotifyapp.spotify.impl;

import com.xworkz.spotifyapp.dto.SongDto;
import com.xworkz.spotifyapp.spotify.Spotify;



public class SpotifyImpl implements Spotify {

    private SongDto[] songs;
    private int index = 0;

    public SpotifyImpl(int size) {
        songs = new SongDto[size];
    }

    @Override
    public boolean addSong(SongDto dto) {
        if (dto != null && dto.getId() > 0 && dto.getName() != null) {
            songs[index++] = dto;
            return true;
        }
        System.out.println("Invalid Song Data!");
        return false;
    }

    @Override
    public void getAllSongs() {
        System.out.println("----- List of Songs -----");
        for (SongDto dto : songs) {
            if (dto != null) {
                System.out.println(dto);
            }
        }
    }

    @Override
    public String getArtistBySongName(String songName) {
        for (SongDto dto : songs) {
            if (dto != null && dto.getName().equalsIgnoreCase(songName)) {
                return dto.getArtist();
            }
        }
        return null;
    }

    @Override
    public int getDurationBySongName(String songName) {
        for (SongDto dto : songs) {
            if (dto != null && dto.getName().equalsIgnoreCase(songName)) {
                return dto.getDuration();
            }
        }
        return 0;
    }

    @Override
    public String getGenreBySongName(String songName) {
        for (SongDto dto : songs) {
            if (dto != null && dto.getName().equalsIgnoreCase(songName)) {
                return dto.getGenre();
            }
        }
        return null;
    }

    @Override
    public String getSongNameByAlbumOrArtist(String albumOrArtist) {
        String songName = null;
        if (albumOrArtist != null && !albumOrArtist.isEmpty()) {
            for (SongDto songDto : songs) {
                if (songDto.getAlbum().equalsIgnoreCase(albumOrArtist) || songDto.getArtist().equalsIgnoreCase(albumOrArtist)) {
                    songName = songDto.getName();
                } else System.out.println("Invalid Details!!!!!!!");

            }
        }
        return songName;
    }

    @Override
    public boolean updateSongDurationById(int id, int newDuration) {
        for (SongDto dto : songs) {
            if (dto != null && dto.getId() == id) {
                dto.setDuration(newDuration);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getAlbumBySongName(String songName) {
        for (SongDto dto : songs) {
            if (dto != null && dto.getName().equalsIgnoreCase(songName)) {
                return dto.getAlbum();
            }
        }
        return null;
    }
}
