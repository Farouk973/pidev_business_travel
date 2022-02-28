package tn.esprit.services;



import tn.esprit.entities.Reclamation;

import java.util.List;

public interface IReclamationService {

	

	void save(Reclamation reclamation);
	
	List<Reclamation> listAll();

	Reclamation get(Long id);
	

	void delete(Long id);

	

	


	
}
