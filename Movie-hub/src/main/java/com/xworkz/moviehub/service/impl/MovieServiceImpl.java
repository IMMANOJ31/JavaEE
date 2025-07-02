package com.xworkz.moviehub.service.impl;

import com.xworkz.moviehub.dto.MovieDto;
import com.xworkz.moviehub.repositry.MovieRepo;
import com.xworkz.moviehub.repositry.impl.MovieRepoImpl;
import com.xworkz.moviehub.service.MovieService;


public class MovieServiceImpl implements MovieService {

    MovieRepo repo ;
    public MovieServiceImpl(){
        repo = new MovieRepoImpl();
    }

    @Override
    public boolean validateAndSave(MovieDto dto) {
        boolean isValidated = false;
        boolean isMovieIdValid = false;
        boolean isMovieNameValid = false;
        boolean isGenreValid = false;
        boolean isDurationValid = false;

        if(dto.getMovieId() != 0){
            isMovieIdValid = true;
        }
        if(dto.getMovieName() != null && !dto.getMovieName().isEmpty()){
            isMovieNameValid = true;
        }
        if(dto.getGenre() != null && !dto.getGenre().isEmpty()){
            isGenreValid = true;
        }
        if(dto.getDuration() != null && !dto.getDuration().isEmpty()){
            isDurationValid = true;
        }
        if(isMovieIdValid && isMovieNameValid && isGenreValid && isDurationValid){
            isValidated = repo.saveData(dto);
        }

        return isValidated;
    }

    @Override
    public boolean updateGenreById(int id, String updateGenre) {
        boolean isGenreUpdated = false;
        if(id != 0 && id>0 && updateGenre != null && !updateGenre.isEmpty()){
            isGenreUpdated = repo.updateGenreById(id,updateGenre);
        }
        return isGenreUpdated;
    }

    @Override
    public boolean deleteMovieById(int id) {
        boolean isDeleted = false;
        if(id >0){
            isDeleted = repo.deleteMovieById(id);
        }
        return isDeleted;
    }

    @Override
    public MovieDto getMovieDetailsById(int id) {
        if(id > 0){
            return repo.getMovieDetailsById(id);
        }
        return null;
    }
}
