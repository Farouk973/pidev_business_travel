package tn.esprit.services;

import java.util.List;


import tn.esprit.entities.Invitation;

public interface InvitationService {

	public Invitation addinvitation (Invitation e);
	public Invitation addinvitation_affecter_employer (Invitation e,Long emplayerId);
	public Invitation ModifInvitation (Long id, Invitation e );
	public void deleteInvitation (Long id ); 
	public List <Invitation> retrieveAllInvitation(); 
	public Invitation retrieveInvitation(Long id );
}
