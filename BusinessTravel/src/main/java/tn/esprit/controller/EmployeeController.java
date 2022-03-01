package tn.esprit.controller;

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
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Employee;
import tn.esprit.services.IEmployeeservice;

@RestController
@RequestMapping("/BusinessTE")

public class EmployeeController {
	@Autowired
	IEmployeeservice employeeService;
	
	
	@GetMapping("/List-employees")
	public List<Employee> list() {
		return employeeService.listAll();
	}

	
	
	@GetMapping("/getById_employee/{id}")
	public ResponseEntity<Employee> get(@PathVariable Long id) {
		try {
			Employee employee = employeeService.get(id);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}

	
	@PostMapping("/add_employee")
	public void add(@RequestBody Employee employee) {
		employeeService.save(employee);
	}

	@PutMapping(value="/update")
    public Employee Update(@RequestBody Employee employee){
        return  employeeService.Update(employee);
	}
        
	@DeleteMapping("/Delete-Employee/{id}")
	public void delete(@PathVariable Long id) {
		employeeService.delete(id);
	}

}
