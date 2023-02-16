package com.externalapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.externalapi.model.Movie;
import com.externalapi.service.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class MovieController {
	@Autowired
	MovieService service;

	@RequestMapping("/")
	String hello() {
		return "index";
	}

	@GetMapping("/getMovieDetails")
	public ResponseEntity<Movie> saveProjectSubmission(@RequestParam String movieName)
			throws JsonMappingException, JsonProcessingException, RestClientException {
		return ResponseEntity.ok().body(service.getMovieDetails(movieName));

	}

}
