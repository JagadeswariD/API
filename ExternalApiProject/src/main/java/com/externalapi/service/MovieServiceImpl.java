package com.externalapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.externalapi.model.Movie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class MovieServiceImpl implements MovieService{
	
	

	@Override
	public Movie getMovieDetails(String movieName) throws JsonMappingException, JsonProcessingException, RestClientException {
		// TODO Auto-generated method stub
		String uri= "https://www.omdbapi.com/?apikey=b79fdda2&t="+movieName;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Movie movie= mapper.readValue(restTemplate.getForObject(uri, String.class), Movie.class); 
		return movie;
	}

}
