package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Autista;

@Repository
public interface AutistaRepository extends JpaRepository<Autista, Long>{

}
