package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Filmes;


public interface FilmesRepo extends JpaRepository<Filmes, Integer>{

}
