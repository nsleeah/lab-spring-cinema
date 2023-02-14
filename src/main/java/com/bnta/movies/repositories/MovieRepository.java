package com.bnta.movies.repositories;

import com.bnta.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

//Summary: Movie Repository Extends JPA & provides all the CRUD operations for the Movie class.
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
