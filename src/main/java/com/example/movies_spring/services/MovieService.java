package com.example.movies_spring.services;

import com.example.movies_spring.models.Movie;
import com.example.movies_spring.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MovieService {
@Autowired
    MovieRepository movieRepository;

    public void createNewMovie(Movie movie){
        movieRepository.save(movie);
    }

    public Optional<Movie> getMovieById(long id) {
        return movieRepository.findById(id);
    }
    public ArrayList findAllMovies(){
        return (ArrayList) movieRepository.findAll();
    }
}
