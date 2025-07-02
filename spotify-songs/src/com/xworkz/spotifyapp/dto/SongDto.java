package com.xworkz.spotifyapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SongDto {

    private int id;
    private String name;
    private String artist;
    private String album;
    private String genre;
    private int duration;
    private String releaseDate;


}


