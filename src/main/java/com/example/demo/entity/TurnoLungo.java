package com.example.demo.entity;

import java.time.LocalTime;

import javax.persistence.Entity;

@Entity
public class TurnoLungo extends Turno{
	
	public TurnoLungo(String luogoInizio, String luogoFine, double lunghezza, int durata, LocalTime ora_inizio, LocalTime ora_fine) {
		super(luogoInizio, luogoFine, lunghezza);
		super.setOra_inizio(ora_inizio);
		super.setOra_fine(ora_fine);
		super.setDurata(durata);
	}

}
