package com.smarte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.smarte.domain.Employee;

/**
 * @author Praveenkumar
 *
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	@Query("FROM Employee e WHERE e.status =: ACTIVE")
	public List<Employee> findAllActiveEmployee();
	
	
}
