package com.xworkz.moviehub.repositry;

import com.xworkz.moviehub.dto.MovieDto;

public interface MovieRepo {

    boolean saveData(MovieDto dto);

    boolean updateGenreById(int id, String updateGenre);

    boolean deleteMovieById(int id);

    MovieDto getMovieDetailsById(int id);
}
