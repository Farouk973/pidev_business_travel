package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserSrvice;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserSrvice uservice ; 
	
	@PostMapping ("/adduser") 
	 public void add(@RequestBody User user) {
		uservice.save(user);
	} 
	////////////////// 
	@GetMapping("/List-user")
	 public List<User> list() {
		return uservice.listAll();
	} 
	///////////////////
	@DeleteMapping ("/Delete-user/{id}")
	public void delete(@PathVariable Long id) {
		uservice.delete(id);
	} 
	///////////////////
	@GetMapping ("/getById/{id}") 
		public ResponseEntity<User> get(@PathVariable Long id) {
		try {
			User user = uservice.get(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
 ////////////////////////////
		@PutMapping(value="/updateUser")
		@ResponseBody
		public User UpdateUser(@RequestBody User user){
			return uservice.UpdateUser(user);
		} 

	

}