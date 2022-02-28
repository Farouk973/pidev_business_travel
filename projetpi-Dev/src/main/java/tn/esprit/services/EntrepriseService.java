package tn.esprit.services;

import tn.esprit.entities.Entreprise;

public interface EntrepriseService {
	public Entreprise ajouterEntreprise(Entreprise e);
	public Entreprise modifierEntreprise(Long id ,Entreprise en) ;
	void deleteEntreprise(Long id);
	Entreprise retrieveEntreprise(Long id);
}
