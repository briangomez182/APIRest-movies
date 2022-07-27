package com.example.demo.repositories.interfaces;

import com.example.demo.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMoviesRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByTitleContaining(String title);
}


