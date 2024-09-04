package com.example.movie_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/movies")

public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestParam String title, @RequestParam String status){
        return MovieService.saveMovie(title, status);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long Id){
        movieService.deleteMovie(Id);
    }
}
