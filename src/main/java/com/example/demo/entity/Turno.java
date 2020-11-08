package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @ElementCollection
    private List<LocalDate> giorni;
    
    @Column(name = "luogo_inizio")
	private String luogoInizio;
    
    @Column(name = "luogo_fine")
	private String luogoFine;

	private double lunghezza;//in km
	int durata;// in minuti
	private LocalTime ora_inizio;
	private LocalTime ora_fine;	
	
	@ManyToOne
	private Autista autista;

    public Turno() {

    }

    public Turno(String luogoInizio, String luogoFine, double lunghezza) {
        this.luogoInizio = luogoInizio;
        this.luogoFine = luogoFine;
        this.lunghezza = lunghezza;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<LocalDate> getGiorni() {
		return giorni;
	}

	public void setGiorni(List<LocalDate> giorni) {
		this.giorni = giorni;
	}

	public String getLuogoInizio() {
		return luogoInizio;
	}

	public void setLuogoInizio(String luogoInizio) {
		this.luogoInizio = luogoInizio;
	}

	public String getLuogoFine() {
		return luogoFine;
	}

	public void setLuogoFine(String luogoFine) {
		this.luogoFine = luogoFine;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public LocalTime getOra_inizio() {
		return ora_inizio;
	}

	public void setOra_inizio(LocalTime ora_inizio) {
		this.ora_inizio = ora_inizio;
	}

	public LocalTime getOra_fine() {
		return ora_fine;
	}

	public void setOra_fine(LocalTime ora_fine) {
		this.ora_fine = ora_fine;
	}

	public Autista getAutista() {
		return autista;
	}

	public void setAutista(Autista autista) {
		this.autista = autista;
	}    
}