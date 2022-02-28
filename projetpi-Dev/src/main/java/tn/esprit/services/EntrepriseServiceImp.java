package tn.esprit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Entreprise;
import tn.esprit.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImp implements EntrepriseService {

	@Autowired
	EntrepriseRepository entrepriserepo;

	@Override
	public Entreprise addentreprise(Entreprise e) {
		entrepriserepo.save(e);
		return e;
	}

	@Override
	public Entreprise Modifentreprise(Long id, Entreprise e ) {
		Entreprise e1 = entrepriserepo.findById(id).get();
		e1.setAdresse(e.getAdresse());
		e1.setCategorie(e.getCategorie());
		e1.setContact(e.getContact());
		e1.setNom(e.getNom());
		entrepriserepo.save(e1);
		return e;
	}

	@Override
	public void deleteEntreprise(Long id) {
		
		entrepriserepo.deleteById(id);
		
	}

	@Override
	public List<Entreprise> retrieveAllEntreprise() {
		
		List<Entreprise> entreprises = new ArrayList<Entreprise>(); 
		entreprises = (List<Entreprise>) entrepriserepo.findAll(); 
		
		
		return entreprises;
	}

	@Override
	public Entreprise retrieveEntreprise(Long id) {
		// TODO Auto-generated method stub
		
		return entrepriserepo.findById(id).get() ;
	}
	
	
	
	
}
