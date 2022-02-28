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
import tn.esprit.entities.Invitation;
import tn.esprit.services.InvitationService;

@RestController
public class InvitationController {
	@Autowired
	InvitationService invser;
	
	@PostMapping(value="/Ajoutinvitation", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Invitation addentreprise(@RequestBody Invitation e) {
		
		return invser.addinvitation(e);
	}
	
	@PostMapping(value="/Ajoutinvitation/{emplayerId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Invitation addinvitation_affecter_employer(@RequestBody Invitation i,@PathVariable("emplayerId") Long emplayerId) {
		
		return invser.addinvitation_affecter_employer(i, emplayerId);
	}
	
	@PutMapping(value="/Modifinvitation/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    public Invitation Modifinviation(@PathVariable("id") Long id, @RequestBody Invitation e ) {
		invser.addinvitation(e); 
		return e;
	}
	
	@DeleteMapping("/removeInvitation/{InvitationId}")
	   public void removeinvitation(@PathVariable("InvitationId") Long InvitationId){
		    invser.deleteInvitation(InvitationId);
	   }
	
	@GetMapping("retrieveInvitation")
	   public List<Invitation> getInvitations(){
	   return invser.retrieveAllInvitation(); 
	   }
	
	@GetMapping("/retrieveInvitation/{InvitationId}")
	   public Invitation retrieveInvitation(@PathVariable("InvitationId") Long id) {
		   	return invser.retrieveInvitation(id); 
	   }

}
