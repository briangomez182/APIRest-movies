package com.example.demo.services;

import com.example.demo.models.Movie;

import java.util.List;
import java.util.Optional;

public interface IMoviesService {
    List<Movie> findAll();
    Optional<Movie> findById(Integer id);
    Movie save (Movie movie);
    Optional<Movie> findByName(String name);
    List<Movie> findByTitleContaining(String title);
}
