package com.externalapi.service;

import org.springframework.web.client.RestClientException;

import com.externalapi.model.Movie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface MovieService {
	
		Movie getMovieDetails(String movieName) throws JsonMappingException, JsonProcessingException, RestClientException;
	
}
