package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Voyage;
import tn.esprit.spring.service.Voyageservice;

@RestController
public class Voyagecontroller {
	@Autowired
	Voyageservice voyageservice ;
	  @PostMapping(value="/addVoyage", consumes = MediaType.APPLICATION_JSON_VALUE)
	  @ResponseBody
	public  Voyage addVoyage(@RequestBody Voyage voyage) {	
	 voyageservice.addVoyage(voyage);
			
		    return voyage;
}
	  @DeleteMapping("/removeVoyaget/{IdVoyage}")
	    public void removeVoyage(@PathVariable("IdVoyage") Long IdVoyage){
		  voyageservice.deleteVoyage(IdVoyage);

	  
	  
	  
}	
	  @PutMapping(value="/updateVoyage", consumes = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody
	    public Voyage UpdateVoyage(@RequestBody Voyage voyage){
	        return  voyageservice.UpdateVoyage(voyage);
}
	  @GetMapping("/retrieveAllVoyage")
		public List<Voyage> retrieveAllVoyage(){
			 return voyageservice.retrieveAllVoyage();
	  }
	  @RequestMapping(value="/Voyage/distnation{distnation}")
		public List<Voyage> getfindbydistnation (Voyage v) {
		  
		return voyageservice.getfindbydistnation(v);
	}


}
