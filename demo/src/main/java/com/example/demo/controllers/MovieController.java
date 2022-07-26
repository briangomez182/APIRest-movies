package com.example.demo.controllers;

import com.example.demo.models.Movie;
import com.example.demo.repositories.interfaces.IMoviesRepository;
import com.example.demo.services.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private IMoviesService iMoviesService;

    // Search movies
    @GetMapping("/all")
    public List<Movie> create() {
        System.out.println("nuevo");

        
        return iMoviesService.findAll();
    }

    // Search movies
    @GetMapping("/test")
    public String test() {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for (int numero: intArray) {
            System.out.println("el valor " + numero);
        }
        return "prueba";
    }
}

