package tn.esprit.spring.service;

import java.util.ArrayList;
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



	@Override
	public List<String> countdistnation() {
		// TODO Auto-generated method stub
		return VoyageRepository.countdistnation();
	}



	@Override
	public List<String> maxdistnationviset() {
		// TODO Auto-generated method stub
		int max=0;
		List<String> names=new ArrayList<String>();
		for (String e :countdistnation()){
			String count_str=e.substring(e.indexOf(",")+1,e.length()) ;
			
			int count=Integer.parseInt(count_str);
			if (count>max){
				max=count;
			}
		}
		for (String e :countdistnation()){
			String count_str=e.substring(e.indexOf(",")+1,e.length()) ;
			
			int count=Integer.parseInt(count_str);
			if (count==max){
				names.add(e.substring(0, e.indexOf(","))+","+count_str);
			}
		}
		return names; 
	}



	@Override
	public List<String> mindistnationviset() {
		List<String> cd=countdistnation();
		int min=Integer.parseInt(cd.get(0).substring(cd.get(0).indexOf(",")+1,cd.get(0).length())); 
		List<String> names=new ArrayList<String>();
		for (String e :cd){
			String count_str=e.substring(e.indexOf(",")+1,e.length()) ;
                         
			
			int count=Integer.parseInt(count_str);

			if (count<min){
				min=count;
			}
		}
		for (String e :cd){
			String count_str=e.substring(e.indexOf(",")+1,e.length()) ;
			
			int count=Integer.parseInt(count_str);
			if (count==min){
				names.add(e.substring(0, e.indexOf(","))+","+count_str);
			}
		}
		return names; 
	}
	

}
