package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Entreprise;

public interface EntrepriseService {
	public Entreprise addentreprise (Entreprise e);
	public Entreprise Modifentreprise (Long id, Entreprise e );
	public void deleteEntreprise (Long id ); 
	public List <Entreprise> retrieveAllEntreprise(); 
	public Entreprise retrieveEntreprise(Long id );

 
	

}
