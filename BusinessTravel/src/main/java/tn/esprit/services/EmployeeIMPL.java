package tn.esprit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Employee;
import tn.esprit.repositories.IEmployeeRepository;

import java.util.List;



@Slf4j



@Service

public class EmployeeIMPL implements IEmployeeservice {
	
    @Autowired

    IEmployeeRepository EmployeeRepo;
    
    @Override

    public List<Employee> listAll() {
        return (List<Employee>) EmployeeRepo.findAll();
    }

    @Override
    public void save(Employee employee) {
    	EmployeeRepo.save(employee);

    }
    @Override
    public Employee Update(Employee employee) {
       
        return EmployeeRepo.save(employee);


    }

    @Override
    public Employee get(Long id) {
    	
         return EmployeeRepo.findById(id).get();
    }
    @Override
    public void delete(Long id) {
    	EmployeeRepo.deleteById(id);
    }



}
