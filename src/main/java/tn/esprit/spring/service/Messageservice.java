package tn.esprit.spring.service;

import tn.esprit.spring.entity.Message;

public interface Messageservice {
	 public Message addMessage(Message message);
	 	public void deleteMessage(Long id);
	 

}
