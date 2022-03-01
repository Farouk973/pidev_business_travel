package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Publication;
import com.example.demo.repository.PublicationRepository;

@Service
public class PublicationServiceIMPL implements PublicationService {
	@Autowired 
	PublicationRepository pubrepo ;

	@Override
	public void save(Publication publication) {
		pubrepo.save(publication) ;
		
	}

	@Override
	public List<Publication> listAll() {
		
	return (List<Publication>) pubrepo.findAll();
	
	}

	@Override
	public Publication get(Long id) {
		
	return pubrepo.findById(id).get();
	
	}

	@Override
	public void delete(Long id) {
		
		pubrepo.deleteById(id) ;
		
	}

	@Override
	public Publication UpdatePublication(Publication publication) {
	 Publication newPublication = pubrepo.findById(publication.getId()).get(); 
	 newPublication.setDate(publication.getDate());
	 newPublication.setSource(publication.getSource());
	 newPublication.setDetails(publication.getDetails());
	 newPublication.setLike(publication.getLike());
	 newPublication.setDislike(publication.getDislike());
	 newPublication.setType(publication.getType());
	 return  pubrepo.save(newPublication); 
	
	
	}


}
