package com.Movies.MoviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Movies.MoviesAPI.entity.Movie;
import com.Movies.MoviesAPI.repository.MovieRepository;

@SpringBootApplication
public class MoviesApiApplication implements CommandLineRunner {
	@Autowired
    MovieRepository m ;
	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		m.save(new Movie("1","Avengers: Endgame"," Anthony Russo"));
		m.save(new Movie("2","Spider-Man: Far From Home"," Jon Watts"));
		m.save(new Movie("3","The Dark Knight"," Christopher Nolan"));
		
	}

}
