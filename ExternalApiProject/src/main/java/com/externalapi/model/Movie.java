package com.externalapi.model;

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

	String title;
	String year;
	String rated;
	String released;
	String genre;
	String director;
	String writer;
	String actors;
	String awards;
	String metascore;
	String imdbRating;
	
}
