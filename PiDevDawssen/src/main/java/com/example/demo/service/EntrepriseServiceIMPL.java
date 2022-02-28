package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entreprise;
import com.example.demo.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceIMPL implements EntrepriseService {
	@Autowired
	EntrepriseRepository entrepo ;
	@Override
	public void save(Entreprise entreprise) {
		entrepo.save(entreprise);
		
	}

	@Override
	public List<Entreprise> listAll() {
		
		return (List<Entreprise>) entrepo.findAll();
	}

	@Override
	public Entreprise get(Long id) {
	return entrepo.findById(id).get();
	
	}

	@Override
	public void delete(Long id) {
	entrepo.deleteById(id);
		
	}

	
}
