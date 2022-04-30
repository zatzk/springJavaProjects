package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AgendaRepo;
import com.example.demo.model.Agenda;

@Controller
public class AgendaController {
	
	@Autowired
	AgendaRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAgenda")
	public String addAgenda(Agenda agenda) {
		
		repo.save(agenda);
		return "home.jsp";
	}
	
	@RequestMapping("/getAgenda")
	public ModelAndView getAgenda(@RequestParam int aid) {
		
		ModelAndView mv = new ModelAndView("showAgenda.jsp");
		Agenda agenda = repo.findById(aid).orElse(new Agenda());
		mv.addObject(agenda);
		
		return mv;
	}
}
