package com.xworkz.moviehub;

import com.xworkz.moviehub.dto.MovieDto;
import com.xworkz.moviehub.service.MovieService;
import com.xworkz.moviehub.service.impl.MovieServiceImpl;

public class MovieRunner {

    static MovieService movieService;

    public static void main(String[] args) {
        MovieDto dto = new MovieDto();
        dto.setMovieId(2);
        dto.setMovieName("thudram");
        dto.setGenre("Thriller");
        dto.setDuration("2hr 34min");

        movieService = new MovieServiceImpl();
        //movieService.validateAndSave(dto);
        //System.out.println("Movie list added!!");

        //movieService.updateGenreById(1,"Horror");
       // System.out.println("Movie Genre Updated...");

//        movieService.deleteMovieById(2);
//        System.out.println("Movie Deleted!!");

        MovieDto fetchData = movieService.getMovieDetailsById(1);
        System.out.println(fetchData);
    }
}
