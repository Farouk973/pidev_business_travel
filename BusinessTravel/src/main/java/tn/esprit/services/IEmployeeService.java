package tn.esprit.services;

import java.util.List;


import tn.esprit.entities.Employee;

public interface IEmployeeservice {

	List<Employee> listAll();

	void save(Employee employee);

	Employee Update(Employee employee);

	Employee get(Long id);

	void delete(Long id);

  

	
}
