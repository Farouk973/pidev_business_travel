package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
