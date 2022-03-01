package tn.esprit.services;



import tn.esprit.entities.Reclamation;

import java.util.List;

public interface IReclamationService {

	

	
	List<Reclamation> listAll();

	Reclamation get(Long id);
	

	void delete(Long id);

	void save(Reclamation reclamation);


	Reclamation Update(Reclamation reclamation);

	void ajouterEtaffecterListeReclamation(List<Reclamation> lb, Long idemployee);
	


	
}
