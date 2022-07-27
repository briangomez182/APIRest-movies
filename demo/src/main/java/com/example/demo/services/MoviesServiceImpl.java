package com.example.demo.services;

import com.example.demo.models.Movie;
import com.example.demo.repositories.interfaces.IMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesServiceImpl implements IMoviesService{

    @Autowired
    private IMoviesRepository moviesRepository;



    @Override
    public List<Movie> findAll() {
        return moviesRepository. findAll();
    }

    @Override
    public Optional<Movie> findById(Integer id) {
        return moviesRepository.findById(id);
    }

    @Override
    public Movie save(Movie movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public Optional<Movie> findByName(String name) {
        return null;
    }

    @Override
    public List<Movie> findByTitleContaining(String title) {
        return moviesRepository.findByTitleContaining(title);
    }


}
