package com.example.demo.entity;

import java.time.LocalTime;

import javax.persistence.Entity;

@Entity
public class TurnoPomeridiano extends Turno{
	
	public TurnoPomeridiano(String luogoInizio, String luogoFine, double lunghezza) {
		super(luogoInizio, luogoFine, lunghezza);

		super.setOra_inizio(LocalTime.parse("14:00:00"));
		super.setOra_fine(LocalTime.parse("20:00:00"));
		super.setDurata(360);
	}

}
