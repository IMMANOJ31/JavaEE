package com.xworkz.moviehub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    private int movieId;
    private String movieName;
    private String genre;
    private String Duration;
}
