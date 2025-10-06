package com.xworkz.moviehub.repositry.impl;

import com.xworkz.moviehub.dto.MovieDto;
import com.xworkz.moviehub.repositry.MovieRepo;

import java.sql.*;

public class MovieRepoImpl implements MovieRepo {
    @Override
    public boolean saveData(MovieDto dto) {
        boolean isSaveData = false;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_hub" , "root" , "Rajashree@31");
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO movie_list (movie_id , movie_name , genre , duration) VALUES (?,?,?,?)");
            preparedStatement.setInt(1, dto.getMovieId());
            preparedStatement.setString(2, dto.getMovieName());
            preparedStatement.setString(3, dto.getGenre());
            preparedStatement.setString(4,dto.getDuration());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

        System.out.println(dto);
        return isSaveData;
    }

    @Override
    public boolean updateGenreById(int id, String updateGenre) {
        boolean isGenreUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_hub", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("update movie_hub.movie_list set genre=? where movie_id=?");
            preparedStatement.setString(1,updateGenre);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return  isGenreUpdated;
    }

    @Override
    public boolean deleteMovieById(int id) {
        boolean isMovieDeleted = false;
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_hub", "root", "Rajashree@31");
            PreparedStatement preparedStatement = conn.prepareStatement("delete from movie_list where movie_id = ?");
            preparedStatement.setInt(1 , id);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        }catch(SQLException e){
            e.printStackTrace();
        }

        return isMovieDeleted;
    }

    @Override
    public MovieDto getMovieDetailsById(int id) {
        MovieDto movieDto = new MovieDto();
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_hub", "root", "Rajashree@31");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from movie_list where movie_id=?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                movieDto.setMovieId(resultSet.getInt(1));
                movieDto.setMovieName(resultSet.getString(2));
                movieDto.setGenre(resultSet.getString(3));
                movieDto.setDuration(resultSet.getString(4));
            }
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return movieDto;
    }
}
