package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Entreprise;
import tn.esprit.services.EntrepriseService;

@RestController
public class EntrepriseController {
	@Autowired
	EntrepriseService entres;
	
	@PostMapping(value="/AjoutEntreprise", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Entreprise addentreprise(@RequestBody Entreprise e) {
		
		return entres.addentreprise(e);
	}
	
	
	@PutMapping(value="/ModifEntreprise/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    public Entreprise Modifentreprise(@PathVariable("id") Long id, @RequestBody Entreprise e ) {
		entres.Modifentreprise(id, e); 
		return e;
	}
	
	@DeleteMapping("/removeEntreprise/{EntrepriseId}")
	   public void removeClient(@PathVariable("EntrepriseId") Long entrepriseId){
		    entres.deleteEntreprise(entrepriseId);
	   }
	
	@GetMapping("retrieveEntreprises")
	   public List<Entreprise> getEntreprises(){
	   return entres.retrieveAllEntreprise(); 
	   }
	
	@GetMapping("/retrieveEntreprise/{EntrepriseId}")
	   public Entreprise retrieveEntreprise(@PathVariable("EntrepriseId") Long id) {
		   	return entres.retrieveEntreprise(id); 
	   }
	
	

}
