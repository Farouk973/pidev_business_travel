package tn.esprit.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Entreprise;
import tn.esprit.repositories.EntrepriseRepository;

@Service
public class EntrepriseServiceImp implements EntrepriseService {

	@Autowired
	EntrepriseRepository entrepriserepo;
	
	@Override
	public Entreprise ajouterEntreprise(Entreprise e) {
		entrepriserepo.save(e);
		return e;
		
	}

	@Override
	public Entreprise modifierEntreprise(Long id, Entreprise e ) {
		Entreprise e_change = entrepriserepo.findById(id).get();
		e_change.setAdresse(e.getAdresse());
		e_change.setCategorie(e.getCategorie());
		e_change.setContact(e.getContact());
		e_change.setNom(e.getNom());
		entrepriserepo.save(e_change);
		return e;
	}
	@Override
	public void deleteEntreprise(Long id) {
		// TODO Auto-generated method stub
		entrepriserepo.deleteById(id);
		
	}
	

	@Override
	public Entreprise retrieveEntreprise(Long id) {
		// TODO Auto-generated method stub
		
		return entrepriserepo.findById(id).get() ;
	}
	
}
