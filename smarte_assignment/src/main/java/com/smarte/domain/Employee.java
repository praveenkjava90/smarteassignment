package com.smarte.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * @author Praveenkumar
 *
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private int age;
	private int annualCtc;
	private LocalDate joiningDate;
	private String status;

	@Embedded
    @AttributeOverrides({
  	  @AttributeOverride( name = "city", column = @Column(name = "emp_city")),
  	  @AttributeOverride( name = "pincode", column = @Column(name = "emp_pincode")),
  	  @AttributeOverride( name = "state", column = @Column(name = "emp_state")),
  	  @AttributeOverride( name = "country", column = @Column(name = "emp_country"))
  	})
    private Address address;
	
	@Embedded
    @AttributeOverrides({
  	  @AttributeOverride( name = "username", column = @Column(name = "username")),
  	  @AttributeOverride( name = "password", column = @Column(name = "password"))
  	})
	private UserCredential userCredential;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "dept_id", referencedColumnName = "dept_id", nullable = true)
	private Department department;

	public Employee() {
	}

	public Employee(int age, int annualCtc, LocalDate joiningDate, String status, 
					Department department, Address address,UserCredential userCredential) {
		this.age = age;
		this.annualCtc = annualCtc;
		this.joiningDate = joiningDate;
		this.status = status;
		this.address = address;
		this.department = department;
		this.userCredential = userCredential;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getAnnualCtc() {
		return annualCtc;
	}

	public void setAnnualCtc(int annualCtc) {
		this.annualCtc = annualCtc;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public UserCredential getUserCredential() {
		return userCredential;
	}

	public void setUserCredential(UserCredential userCredential) {
		this.userCredential = userCredential;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", age=" + age + ", annualCtc=" + annualCtc + ", joiningDate="
				+ joiningDate + ", status=" + status + ", address=" + address + ", userCredential=" + userCredential
				+ ", department=" + department + "]";
	}
	
	
}
