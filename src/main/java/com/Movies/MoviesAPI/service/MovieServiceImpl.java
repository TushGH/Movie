package com.Movies.MoviesAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movies.MoviesAPI.entity.Movie;
import com.Movies.MoviesAPI.exception.BadRequestException;
import com.Movies.MoviesAPI.exception.ResourceNotFoundException;
import com.Movies.MoviesAPI.repository.MovieRepository;




@Service
public class MovieServiceImpl implements MovieService{
	
    @Autowired
    private MovieRepository movieRepository ;
	
	@Override
	public List<Movie> findAll() {
		
		return (List<Movie>)movieRepository.findAll();
	}

	@Override
	public Movie findOne(String id) {
		Optional<Movie> existing = movieRepository.findById(id); 
    	if(!existing.isPresent()) {
    		throw new ResourceNotFoundException("Movie with Id " + id + "Not present");
    	}
    	return existing.get() ;
	}

	@Override
	public void delete(String id) {
		
		 Optional<Movie> existing = movieRepository.findById(id); 
    	if(!existing.isPresent()) {
    		throw new ResourceNotFoundException("Employee with Id " + id + "Not present");
    	}
    	movieRepository.delete(existing.get()); 
		
		
	}
	
	@Override
	public Movie create(Movie mov) {
		 if(mov == null) {
    		throw new BadRequestException("Check Body of request");
    	}
    	return movieRepository.save(mov);
		 
	}

	@Override
	public Movie update(Movie mov) {
		 if(mov == null) {
	    		throw new BadRequestException("Check Body of request");
	    	}
	    	return movieRepository.save(mov);
	}


}
