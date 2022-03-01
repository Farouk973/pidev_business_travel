package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Commentaire;
import com.example.demo.repository.CommentaireRepository;

@Service
public class CommentaireServiceIMPL implements CommentaireSevice  {
	@Autowired
	CommentaireRepository cmrepo ;

	@Override
	public void save(Commentaire commentaire) {
		cmrepo.save(commentaire);
		
	}

	@Override
	public List<Commentaire> listAll() {

		return (List<Commentaire>) cmrepo.findAll();
	}

	@Override
	public Commentaire get(Long id) {

		return cmrepo.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		cmrepo.deleteById(id);
		
	}

	@Override
	public Commentaire UpdateCommentaire(Commentaire commentaire) {
		Commentaire newCommentaire = cmrepo.findById(commentaire.getId()).get();
		newCommentaire.setContenu(commentaire.getContenu());
		newCommentaire.setDate(commentaire.getDate());
		newCommentaire.setSource(commentaire.getSource());
		return cmrepo.save(newCommentaire);
		
	}



	

}
