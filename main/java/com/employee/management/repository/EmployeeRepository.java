package com.employee.management.repository;

import com.employee.management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();

	// search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

	Optional<Employee> findById(int theId);


	public void deleteById(int theId);
}


