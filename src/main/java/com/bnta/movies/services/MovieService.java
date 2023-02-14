package com.bnta.movies.services;

import com.bnta.movies.models.Movie;
import com.bnta.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    @Autowired //Inject Dependencies
     MovieRepository movieRepository;

    public List<Movie> getAllMovies(){return movieRepository.findAll(); }

    public Movie getMovieById(int id){
        return movieRepository.findById(id).get();
        //Gets a Specific Movie Out .Get Pulls Out Movie Object

    }

    public Movie createMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }
}
