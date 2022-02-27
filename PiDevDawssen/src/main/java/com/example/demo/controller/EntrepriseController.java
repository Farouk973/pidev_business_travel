package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Entreprise;
import com.example.demo.service.EntrepriseService;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {
	@Autowired
	EntrepriseService enservice ; 
	
	@PostMapping ("/add")
	 public void add(@RequestBody Entreprise entreprise) {
		enservice.save(entreprise);
	} 
	//////////////////////
	@GetMapping("/List-ent")
	public List<Entreprise> list() {
		return enservice.listAll();
	} 
	///////////////////// 
	@DeleteMapping ("/Delete-ent/{id}") 
	public void delete(@PathVariable Long id) {
		enservice.delete(id);
	} 
	/////////////////// 
	@GetMapping ("/getById/{id}") 
	 public ResponseEntity<Entreprise> get(@PathVariable Long id) {
		try {
			Entreprise entreprise = enservice.get(id);
			return new ResponseEntity<Entreprise>(entreprise, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Entreprise>(HttpStatus.NOT_FOUND);
		}
	} 

	

}
