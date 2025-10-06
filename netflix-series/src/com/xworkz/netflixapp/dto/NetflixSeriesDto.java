package com.xworkz.netflixapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetflixSeriesDto {


        private String title;
        private String genre;
        private int seasons;
        private double rating;
        private String director;


}



