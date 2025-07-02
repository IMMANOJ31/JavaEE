package com.xworkz.netflixapp.service.impl;

import com.xworkz.netflixapp.dto.NetflixSeriesDto;
import com.xworkz.netflixapp.service.Netflix;



public class NetflixSeriesImpl implements Netflix {

    private NetflixSeriesDto[] seriesDtos;
    int index;

    public NetflixSeriesImpl(int size) {
        seriesDtos = new NetflixSeriesDto[size];
    }

    @Override
    public boolean addSeries(NetflixSeriesDto dto) {
        boolean isAdded = false;
        if (dto.getTitle() != null && dto.getSeasons() > 0) {
            seriesDtos[index++] = dto;
            isAdded = true;
        } else {
            System.out.println("Invalid Series Information!");
        }
        return isAdded;
    }

    @Override
    public void getAllSeries() {
        System.out.println("Available Netflix Series:");
        for (NetflixSeriesDto dto : seriesDtos) {
            if (dto != null)
                System.out.println(dto);
        }
    }

    @Override
    public String getGenreByTitle(String title) {
        String genre = null;
        for (NetflixSeriesDto dto : seriesDtos) {
            if (dto != null && dto.getTitle().equalsIgnoreCase(title)) {
                genre = dto.getGenre();
            }
        }
        return genre;
    }

    @Override
    public int getSeasonsByTitle(String title) {
        int seasons = 0;
        for (NetflixSeriesDto dto : seriesDtos) {
            if (dto != null && dto.getTitle().equalsIgnoreCase(title)) {
                seasons = dto.getSeasons();
            }
        }
        return seasons;
    }

    @Override
    public double getRatingByTitle(String title) {
        double rating = 0.0;
        for (NetflixSeriesDto dto : seriesDtos) {
            if (dto != null && dto.getTitle().equalsIgnoreCase(title)) {
                rating = dto.getRating();
            }
        }
        return rating;
    }

    @Override
    public boolean updateRatingByTitle(String title, double newRating) {
        boolean isUpdated = false;
        for (NetflixSeriesDto dto : seriesDtos) {
            if (dto != null && dto.getTitle().equalsIgnoreCase(title)) {
                dto.setRating(newRating);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public String getSeriesTitleByDirector(String directorName) {
        for (NetflixSeriesDto dto : seriesDtos) {
            if (dto != null && dto.getDirector().equalsIgnoreCase(directorName)) {
                return dto.getTitle();
            }
        }
        return null;
    }


}
