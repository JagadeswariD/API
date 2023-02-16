package com.externalapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@ToString
@EqualsAndHashCode
public class Movie {

	@JsonProperty("Title")
	String title;
	@JsonProperty("Year")
	String year;
	@JsonProperty("Rated")
	String rated;
	@JsonProperty("Released")
	String released;
	@JsonProperty("Genre")
	String genre;
	@JsonProperty("Director")
	String director;
	@JsonProperty("Writer")
	String writer;
	@JsonProperty("Actors")
	String actors;
	@JsonProperty("Awards")
	String awards;
	@JsonProperty("Metascore")
	String metascore;
	@JsonProperty("imdbRating")
	String imdbRating;
	@JsonProperty("Poster")
	String poster;

}
