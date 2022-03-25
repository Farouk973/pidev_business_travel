package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Voyage;

public interface Voyageservice {
	public Voyage addVoyage(Voyage voyage);
	public void deleteVoyage(Long id);
	public Voyage UpdateVoyage(Voyage Voyage);
	public  List<Voyage> retrieveAllVoyage();
	public List<Voyage> getfindbydistnation (Voyage v);

}
