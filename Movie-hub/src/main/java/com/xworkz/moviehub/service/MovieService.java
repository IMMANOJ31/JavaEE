package com.xworkz.moviehub.service;

import com.xworkz.moviehub.dto.MovieDto;

public interface MovieService {

    boolean validateAndSave(MovieDto dto);

    boolean updateGenreById(int id, String updateGenre);

    boolean deleteMovieById(int id);

    MovieDto getMovieDetailsById(int id);
}
