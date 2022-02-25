package tn.esprit.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.esprit.entities.Reclamation;

import tn.esprit.services.IReclamationService;


import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/BusinessT")

public class ReclamationController {
	@Autowired
	IReclamationService reclamService;
	
	
	@GetMapping("/List-reclam")
	public List<Reclamation> list() {
		return reclamService.listAll();
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Reclamation> get(@PathVariable Long id) {
		try {
			Reclamation reclamation = reclamService.get(id);
			return new ResponseEntity<Reclamation>(reclamation, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Reclamation>(HttpStatus.NOT_FOUND);
		}
	}

	
	@PostMapping("/add")
	public void add(@RequestBody Reclamation reclamation) {
		reclamService.save(reclamation);
	}

	
	
	@DeleteMapping("/Delete-reclam/{id}")
	public void delete(@PathVariable Long id) {
		reclamService.delete(id);
	}
	
	
	
	}
