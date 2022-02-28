package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Employee;

public interface IEmployeeService {

	List<Employee> listAll();

	void ajoutEmployee(Employee employee);

}
