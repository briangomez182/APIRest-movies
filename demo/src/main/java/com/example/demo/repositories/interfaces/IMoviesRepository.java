package com.example.demo.repositories.interfaces;

import com.example.demo.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoviesRepository extends JpaRepository<Movie, Integer> {
}


