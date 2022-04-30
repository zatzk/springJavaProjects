package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Agenda;

public interface AgendaRepo extends CrudRepository<Agenda, Integer> {
	
	
}
