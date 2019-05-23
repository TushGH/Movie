package com.Movies.MoviesAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.Movies.MoviesAPI.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie , String>{

}
