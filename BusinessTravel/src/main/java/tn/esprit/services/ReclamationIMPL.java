package tn.esprit.services;


import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Reclamation;
import tn.esprit.repositories.IEmployeeRepository;
import tn.esprit.repositories.IReclamationRepository;
import tn.esprit.entities.Employee;

@Slf4j



@Service

public class ReclamationIMPL implements IReclamationService{

	@Autowired
	IReclamationRepository reclamrepo;
	  @Autowired

	    IEmployeeRepository EmployeeRepo;
	
	
	
	public List<Reclamation> listAll() {
		return (List<Reclamation>) reclamrepo.findAll();
	}
	
	@Override
	public void save(Reclamation reclamation) {
		reclamrepo.save(reclamation);
		
		}
	@Override
	public Reclamation Update (Reclamation reclamation) {
		return reclamrepo.save(reclamation);

		}
	
	
	public Reclamation get(Long id) {
		return reclamrepo.findById(id).get();
	}
	
	public void delete(Long id) {
		reclamrepo.deleteById(id);
	}

@Override
	
	public void ajouterEtaffecterListeReclamation(List<Reclamation> lb, Long idemployee) {
		Employee employee = EmployeeRepo.findById(idemployee).orElse(null);
		for (Reclamation reclamation : lb) {
			reclamation.setEmployee(employee);
			reclamrepo.save(reclamation);
		}
	}
	
	
	
	}

	
	

	




