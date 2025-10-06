package com.xworkz.netflixapp.service;

import com.xworkz.netflixapp.dto.NetflixSeriesDto;

public interface Netflix {

        boolean addSeries(NetflixSeriesDto dto);

        void getAllSeries();

        String getGenreByTitle(String title);

        int getSeasonsByTitle(String title);

        double getRatingByTitle(String title);

        boolean updateRatingByTitle(String title, double newRating);

        String getSeriesTitleByDirector(String directorName);

}



