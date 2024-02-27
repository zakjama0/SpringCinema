package com.example.movies_spring.repositories;

import com.example.movies_spring.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}