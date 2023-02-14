package com.bnta.movies.controllers;

import com.bnta.movies.models.Movie;
import com.bnta.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Handles HTTP Requests
@RequestMapping(value = "/movies") //Maps Route
public class MovieController {
    @Autowired
     MovieService movieService; //Dependency Injection MovieService Object.

    //Method One
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() { //Get Request for Movies.
        List<Movie> movies = movieService.getAllMovies(); //Movie Service retrieves list movies and return movie object.
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
         Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        Movie movieToBeSaved = movieService.createMovie(movie);
        return new ResponseEntity<>(movieToBeSaved, HttpStatus.CREATED);
    }//Post - Takes Input Request, Saves using Service Layer - > Back User Response - Moved to be Saved = Response.
    //Post Movie, what we want to see back.

    //Extended Notes.
    //400 - Request Problem
    //500 - Server Issue.
    //Deserialization - i.e JSON - Java Object
    //Serialization - Turning Data from one form to another, Object JSON.






}
