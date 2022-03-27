package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Message;

import tn.esprit.spring.service.Messageservice;

@RestController
public class Messagecontroller {
	@Autowired
	Messageservice messageservice;

	@PostMapping(value="/emp/addmessage", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  Message addMessage(@RequestBody Message message) {	
		messageservice.addMessage(message);

		return message;
	}
	

	@DeleteMapping("/admin/removeMessage/{IdMessage}")
	public void removeMessage(@PathVariable("IdMessage") Long IdMessage){
		messageservice.deleteMessage(IdMessage);






	}
}
