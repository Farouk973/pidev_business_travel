package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Entreprise;

public interface EntrepriseService {
	 void save(Entreprise entreprise);
	List<Entreprise> listAll();
	Entreprise get(Long id);
	void delete(Long id);
	public Entreprise UpdateEntreprise(Entreprise entreprise); 

}
