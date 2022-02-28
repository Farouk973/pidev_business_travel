package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserSrvice {
	void save(User user);
	List<User> listAll();
	User get(Long id);
	void delete(Long id); 

}
