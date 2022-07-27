package com.example.demo.controllers;

import com.example.demo.models.Movie;
import com.example.demo.services.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private IMoviesService iMoviesService;

    // Search movies
    @GetMapping("/")
    public List<Movie> create() {
        return iMoviesService.findAll();
    }

    // Search a movie
    @GetMapping("/{id}")
    public Optional<Movie> searchMovie(@PathVariable("id") Integer idMovie) {
        return iMoviesService.findById(idMovie);
    }

    // Search a movie
    @PostMapping("/")
    public Movie saveMovie(@RequestBody() Movie movie) {
        return iMoviesService.save(movie);
    }
}

