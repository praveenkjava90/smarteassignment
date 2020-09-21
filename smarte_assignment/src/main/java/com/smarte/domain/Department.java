package com.smarte.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Praveenkumar
 *
 */
@Entity
@Table(name="departments")
public class Department implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dept_id;
    private String name;
    private String region;
    
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Department() {
    }

	public Department(String name, String region) {
		this.name = name;
		this.region = region;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int id) {
		this.dept_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + ", region=" + region + ", employees=" + employees
				+ "]";
	} 
	
}

