package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AgendaRepo;
import com.example.demo.model.Agenda;

@RestController
public class AgendaController {
	
	@Autowired
	AgendaRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@SuppressWarnings("deprecation")
	@DeleteMapping("/agenda/{aid}")
	public String deleteAgenda(@PathVariable int aid) {
		Agenda a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@PostMapping("/agenda")
	public Agenda addAgenda(@RequestBody Agenda agenda) {	
		repo.save(agenda);
		return agenda;
	}
	
	@PutMapping("/agenda")
	public Agenda saveOrUpdateAgenda(@RequestBody Agenda agenda) {	
		repo.save(agenda);
		return agenda;
	}
	
	@GetMapping(path="/agenda")
	public List<Agenda> getAgenda() {	
		return repo.findAll();		
	}
	
	@RequestMapping("/agenda/{aid}")
	public Optional<Agenda> getAgenda(@PathVariable("aid") int aid) {
		return repo.findById(aid);	
	}
}
