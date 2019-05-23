package com.Movies.MoviesAPI.service;

import java.util.List;

import com.Movies.MoviesAPI.entity.Movie;



public interface MovieService {

	public List<Movie> findAll();
	public Movie findOne(String id);
	public void delete(String id);
	public Movie create(Movie mov);
	public Movie update(Movie mov);

}
