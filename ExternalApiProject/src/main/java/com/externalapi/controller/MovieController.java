package com.externalapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.externalapi.model.Movie;

@Controller
public class MovieController {
	
	@RequestMapping("/")
	String hello() {
		return "index";
	}
	
	@GetMapping("/searchTitle")
    public String loginForm(Model model) {
        model.addAttribute("myMovie", new Movie());
        return "titleForm";
    }
	
    @PostMapping("/saveTitle")
    public String saveLoginSubmission(Model model, Movie myMovie) {
    	
    	System.out.println(">>>>>> title=" + myMovie.getTitle());
    	model.addAttribute("myMovie", myMovie);
        return "index";
    }


}
