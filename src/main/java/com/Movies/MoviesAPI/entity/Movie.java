package com.Movies.MoviesAPI.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private String id ;
	private String title ;
	private String director ;
	public Movie(String id, String title, String director) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Movie() {
		
		
	}
	@Override
	public String toString() {
		return "movie [id=" + id + ", title=" + title + ", director=" + director + "]";
	}
	
	

}
