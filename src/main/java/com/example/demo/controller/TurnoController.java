package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Autista;
import com.example.demo.entity.Turno;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AutistaRepository;
import com.example.demo.repository.TurnoRepository;

@RestController
@RequestMapping("/api/turni")
public class TurnoController {

	@Autowired
	private TurnoRepository turnoRepository;
	
	@Autowired
	private AutistaRepository autistaRepository;

	// create turno
	@PostMapping
	public Turno createTurno(@RequestBody Turno turno) {		
		return this.turnoRepository.save(turno);
	}
	
	// delete turno by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Turno> deleteTurno(@PathVariable ("id") long turnoId){
		Turno turno = this.turnoRepository.findById(turnoId)
					.orElseThrow(() -> new ResourceNotFoundException("Turno non trovato con id:" + turnoId));
		 this.turnoRepository.delete(turno);
		 return ResponseEntity.ok().build();
	}
	
	// delete turni by autista
	@DeleteMapping("/autista/{id}")
	public Autista deleteTurniByAutista(@PathVariable ("id") long autistaId){
		Autista autista = this.autistaRepository.findById(autistaId)
				.orElseThrow(() -> new ResourceNotFoundException("Autista non trovato con id:" + autistaId));
		autista.getTurni().clear();
		return this.autistaRepository.save(autista);
	}
}
