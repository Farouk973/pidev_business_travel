package tn.esprit.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Employee;
import tn.esprit.entities.Entreprise;
import tn.esprit.entities.Invitation;
import tn.esprit.repository.EmployeeRepository;
import tn.esprit.repository.InvitationRepository;


@Service
public class InvitationServiceImp implements InvitationService {

	@Autowired
	InvitationRepository invrep;
	@Autowired
	EmployeeRepository emprep;

	@Override
	public Invitation addinvitation(Invitation e) {
		invrep.save(e);
		return e;
	}
	
	@Override
	public Invitation addinvitation_affecter_employer(Invitation e,Long emplayerId) {
		Employee em = emprep.findById(emplayerId).get();
		em.setInvitation(e);
		invrep.save(e);
		return e;
		
	}

	@Override
	public Invitation ModifInvitation(Long id, Invitation e) {
		Invitation e1 = invrep.findById(id).get();
		e1.setContenue(e.getContenue());
		e1.setId(e1.getId());
		invrep.save(e);
		return e;
	}

	@Override
	public void deleteInvitation(Long id) {
		invrep.deleteById(id);
		
	}

	@Override
	public List<Invitation> retrieveAllInvitation() {
		List<Invitation> Invitations = new ArrayList<Invitation>(); 
		Invitations = (List<Invitation>) invrep.findAll();
		return Invitations;
	}

	@Override
	public Invitation retrieveInvitation(Long id) {
		
		return invrep.findById(id).get();
	}

	
	
}
