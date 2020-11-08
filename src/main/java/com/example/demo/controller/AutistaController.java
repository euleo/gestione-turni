package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Autista;
import com.example.demo.repository.AutistaRepository;

@RestController
@RequestMapping("/api/autista")
public class AutistaController {
	
	@Autowired
	private AutistaRepository autistaRepository;
	
	// create autista
	@PostMapping
	public Autista createAutista(@RequestBody Autista a) {		
		return this.autistaRepository.save(a);
	}
}
