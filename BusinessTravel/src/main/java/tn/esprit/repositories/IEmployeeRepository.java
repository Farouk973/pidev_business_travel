package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Long> {

}
