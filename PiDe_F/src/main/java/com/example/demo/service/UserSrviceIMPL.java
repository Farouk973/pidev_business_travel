package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserSrviceIMPL implements UserSrvice {
	@Autowired
	UserRepository urepo ;

	@Override
	public void save(User user) {
		urepo.save(user);
		
		
	}

	@Override
	public List<User> listAll() {
		 
   return (List<User>) urepo.findAll();

	}

	@Override
	public User get(Long id) {
		
		return urepo.findById(id).get();

	}

	@Override
	public void delete(Long id) {
		
		urepo.deleteById(id);
		
	}

	@Override
	public User UpdateUser(User user) {
	 User newUser = urepo.findById(user.getId()).get(); 
	 newUser.setNom(user.getNom());
	 newUser.setPrenom(user.getPrenom());
	 newUser.setMail(user.getMail());
	 newUser.setAdresse(user.getAdresse());
	 newUser.setNum_tel(user.getNum_tel());
	 newUser.setSexe(user.getSexe());
	 newUser.setEtat(user.getEtat());
	 newUser.setCin(user.getCin());
	 newUser.setPost(user.getPost());
	 newUser.setStatus_civil(user.getStatus_civil());
	 return urepo.save(newUser);
	
	
	}

	
}
