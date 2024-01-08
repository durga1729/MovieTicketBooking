package com.booking.movie.controller;

import com.booking.movie.domain.Movie;
import com.booking.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/getMoviesByCity/{cityName}")
    public ResponseEntity<List<Movie>> getMoviesListByCity(@PathVariable String cityName) throws ParseException {
        List<Movie> moviesByCity = movieService.getMoviesByCity(cityName);
        return ResponseEntity.ok(moviesByCity);
    }

    @GetMapping("/getMoviesByGener")
    public ResponseEntity<List<Movie>> getMoviesListByGener() {
        List<Movie> moviesByGener = new ArrayList<>();
        return ResponseEntity.ok(moviesByGener);
    }

    @GetMapping("/getMoviesByLanguage")
    public ResponseEntity<List<Movie>> getMoviesListByLanguage() {
        List<Movie> moviesByLanguage = new ArrayList<>();
        return ResponseEntity.ok(moviesByLanguage);
    }

}
