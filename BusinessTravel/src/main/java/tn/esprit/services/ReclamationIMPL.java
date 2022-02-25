package tn.esprit.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Reclamation;
import tn.esprit.repositories.IReclamationRepository;
@Slf4j



@Service

public class ReclamationIMPL implements IReclamationService{

	@Autowired
	IReclamationRepository reclamrepo;
	
	public List<Reclamation> listAll() {
		return (List<Reclamation>) reclamrepo.findAll();
	}
	
	@Override
	public void save(Reclamation reclamation) {
		
		reclamrepo.save(reclamation);
	}
	
	public Reclamation get(Long id) {
		return reclamrepo.findById(id).get();
	}
	
	public void delete(Long id) {
		reclamrepo.deleteById(id);
	}

	

	
	
	}

	
	

	




