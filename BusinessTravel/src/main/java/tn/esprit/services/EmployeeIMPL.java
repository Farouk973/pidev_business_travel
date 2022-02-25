package tn.esprit.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Employee;
import tn.esprit.repositories.IEmployeeRepository;


@Slf4j

@Service
public class EmployeeIMPL  implements IEmployeeService{
	@Autowired
	IEmployeeRepository Employeerepo;
	@Override
	public List<Employee> listAll() {
		return (List<Employee>) Employeerepo.findAll();
	}
	@Override
	@Autowired
	public void ajoutEmployee(Employee employee) {
		
		Employeerepo.save(employee);
		
			}
}
