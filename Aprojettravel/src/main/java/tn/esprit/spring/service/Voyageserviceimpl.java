package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Voyage;
import tn.esprit.spring.repository.Voyagerepo;
@Service
public class Voyageserviceimpl implements Voyageservice {
	@Autowired
	Voyagerepo VoyageRepository;

	@Override
	public Voyage addVoyage(Voyage voyage) {
		// TODO Auto-generated method stub
		VoyageRepository.save(voyage);
		return voyage;
	}

	

	@Override
	public void deleteVoyage(Long id) {
	// TODO Auto-generated method stub
		VoyageRepository.deleteById(id);
		
	}

	@Override
	public Voyage UpdateVoyage(Voyage voyage) {
		// TODO Auto-generated method stub
		Voyage newVoyage = VoyageRepository.findById(voyage.getIdVoyage()).get(); 
		newVoyage.setDistnation(voyage.getDistnation());
	newVoyage.setDate(voyage.getDate());
		newVoyage.setDuree(voyage.getDuree());
		newVoyage.setImage(voyage.getImage());
		newVoyage.setObjet_de_voyage(voyage.getObjet_de_voyage());
		return VoyageRepository.save(newVoyage);
}

	@Override
	public List<Voyage> retrieveAllVoyage() {
		// TODO Auto-generated method stub
		return (List<Voyage>) VoyageRepository.findAll();
	
	}



	@Override
	public List<Voyage> getfindbydistnation(Voyage v) {
		
		return VoyageRepository.findbydistnation(v.getDistnation(),v.getIdVoyage());
		// TODO Auto-generated method stub
		
	}
	

}
