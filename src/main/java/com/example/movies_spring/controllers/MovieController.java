package com.example.movies_spring.controllers;

import com.example.movies_spring.models.Movie;
import com.example.movies_spring.repositories.MovieRepository;
import com.example.movies_spring.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {


    @Autowired
    MovieService movieService;

    public MovieController(){}
    @PostMapping
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
    movieService.createNewMovie(movie);
    return new ResponseEntity<>("New movie made", HttpStatus.CREATED);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieStatus(@PathVariable long id) {
        Optional<Movie> anotherMovie = movieService.getMovieById(id);
        return new ResponseEntity<>(anotherMovie.get(),HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<ArrayList> getListOf(){
        return new ResponseEntity<>(movieService.findAllMovies(), HttpStatus.ACCEPTED);
    }
}




