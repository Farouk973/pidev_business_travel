package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Message;
import tn.esprit.spring.repository.Messagerepo;

@Service
public class Messageserviceimpl implements Messageservice {
	private static final String List = null;
	private static final List<String> Bw = new ArrayList<>(Arrays.asList("fuck","bitch","ass","pussy","dick","boobs"));
	@Autowired
	Messagerepo messagerepo;

	@Override
	public Message addMessage(Message message) {
		// TODO Auto-generated method stub
		String m= message.getText();
		String[] words= m.split("\\s");
		for(String e : Bw){ 
			for(int i=0 ; i< words.length;i++){
				if (words[i].toUpperCase().equals(e.toUpperCase())){
					String repeated = new String(new char[words[i].length()-2]).replace("\0", "*");
					words[i]=words[i].charAt(0)+repeated+words[i].charAt(words[i].length()-1);
				}	
			}
		}
		StringBuilder tmp = new StringBuilder();
		for(String e:words){
			tmp.append(e+" ");
		}
		String m2 = tmp.toString();
		
		message.setText(m2.substring(0, m2.length()-1));
		if (m != null && !m.equals("")) {
			messagerepo.save(message);
        }
		return message;
	}

	@Override
	public void deleteMessage(Long id) {
		// TODO Auto-generated method stub
		messagerepo.deleteById(id);
		
	}



}
