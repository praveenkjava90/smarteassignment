package com.smarte.repository;

import org.springframework.data.repository.CrudRepository;

import com.smarte.domain.Department;
/**
 * @author Praveenkumar
 *
 */
public interface DepartmentRepository extends CrudRepository<Department,Long>{
	//Department findByDeptId(int deptId);
}
