package com.Movies.MoviesAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Movies.MoviesAPI.entity.Movie;
import com.Movies.MoviesAPI.service.MovieService;


@RestController(value = "/moives")
public class movieControler {
	@Autowired
	private MovieService movieservice ;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAll(){
		return movieservice.findAll();
	}
	
	
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE ,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie create(@RequestBody Movie mov) {
		return movieservice.create(mov);
	}
	
	
}
