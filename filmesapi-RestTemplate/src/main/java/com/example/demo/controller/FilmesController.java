package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FilmesController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping(value = "/callfilmesapi")
	private String getFilmes() {
		String uri = "https://sujeitoprogramador.com/r-api/?api=filmes";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	
}
