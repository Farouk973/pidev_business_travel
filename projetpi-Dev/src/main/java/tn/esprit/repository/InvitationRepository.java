package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;


import tn.esprit.entities.Invitation;

public interface InvitationRepository extends CrudRepository<Invitation,Long> {

}
