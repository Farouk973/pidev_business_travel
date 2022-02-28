package tn.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	EntrepriseService entrepriseserv;

	@PostMapping(value="/addEntreprise", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void addEntreprise(@RequestBody Entreprise entreprise)
	{
		entrepriseserv.ajouterEntreprise(entreprise);
		
	}
	@PutMapping(value="/updateEntreprise/{id]",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Entreprise updateEntreprise(@PathVariable Long id , @RequestBody Entreprise entreprise)
	{
		entrepriseserv.modifierEntreprise(id,entreprise);
		return entreprise;
	}

	 @org.springframework.web.bind.annotation.DeleteMapping("/removeEntreprise/{EntrepriseId}")
	   public void removeClient(@PathVariable("EntrepriseId") Long entrepriseId){
		 entrepriseserv.deleteEntreprise(entrepriseId);
	   }

		@org.springframework.web.bind.annotation.GetMapping("/retrieveEntreprise/{EntrepriseId}")
		   public Entreprise retrieveClient(@PathVariable("EntrepriseId") Long id) {
			   	return entrepriseserv.retrieveEntreprise(id); 
		   }
		

}
