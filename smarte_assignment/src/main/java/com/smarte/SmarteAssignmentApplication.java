package com.smarte;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.smarte.domain.Address;
import com.smarte.domain.Department;
import com.smarte.domain.Employee;
import com.smarte.domain.UserCredential;
import com.smarte.repository.DepartmentRepository;
import com.smarte.repository.EmployeeRepository;

/**
 * @author Praveenkumar
 *
 */

@SpringBootApplication
public class SmarteAssignmentApplication {
	
	//Creating Logger object
	private static final Logger logger = LoggerFactory.getLogger(SmarteAssignmentApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SmarteAssignmentApplication.class, args);
		logger.info("Application Starting..");	
	}
	/* Here we are using CommandLineRunner interface to load all the 20 dummy employees  using Lambda expression
	* when an application is fully started, These interfaces get called just before run() once SpringApplication completes.
	**/
	
	@Bean
	public CommandLineRunner mappingDemo(DepartmentRepository departmentRepository,
			EmployeeRepository employeeRepository) {
		return args -> {
			// create a HR Department
			Department department1 = new Department("HR", "North America");
			// save the HR department
			departmentRepository.save(department1);

			// create a Payrol Department
			Department department2 = new Department("Payrol", "Asia");
			// save the Payrol department
			departmentRepository.save(department2);

			// Creating and adding some dummy employees
			employeeRepository.save(new Employee(25, 400000, LocalDate.now(), "ACTIVE", department1,
					new Address("Mumbai", "400601", "Maharashtra", "India"), new UserCredential("praveen", "praveen")));
			employeeRepository.save(new Employee(26, 450000, LocalDate.now(), "ACTIVE", department1,
					new Address("Thane", "400602", "Maharashtra", "India"), new UserCredential("ravi", "ravi")));
			employeeRepository.save(new Employee(27, 500000, LocalDate.now(), "ACTIVE", department1,
					new Address("Pune", "400603", "Maharashtra", "India"), new UserCredential("ajay", "ajay")));
			employeeRepository.save(new Employee(30, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Nagpur", "400604", "Maharashtra", "India"), new UserCredential("naveen", "naveen")));
			employeeRepository.save(new Employee(35, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Aurangabad", "400605", "Maharashtra", "India"), new UserCredential("amit", "amit")));
			employeeRepository.save(new Employee(40, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Gujrat", "400606", "Gujrat", "India"), new UserCredential("anil", "anil")));
			employeeRepository.save(new Employee(42, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Jaipur", "400607", "Gujrat", "India"), new UserCredential("mahesh", "mahesh")));
			employeeRepository.save(new Employee(45, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Delhi", "400608", "Delhi", "India"), new UserCredential("vinay", "vinay")));
			employeeRepository.save(new Employee(47, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Noida", "400609", "Delhi", "India"), new UserCredential("nitin", "nitin")));
			employeeRepository.save(new Employee(49, 600000, LocalDate.now(), "ACTIVE", department1,
					new Address("Punjab", "400610", "Punjab", "India"), new UserCredential("rahul", "rahul")));
			employeeRepository.save(new Employee(52, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Manipur", "400611", "Maharashtra", "India"), new UserCredential("sonu", "sonu")));
			employeeRepository.save(new Employee(48, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Gajiyabaad", "400612", "Gajiyabaad", "India"), new UserCredential("abhishek", "abhishek")));
			employeeRepository.save(new Employee(41, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Mirzapur", "400613", "Uttar Pradesh", "India"), new UserCredential("raj", "raj")));
			employeeRepository.save(new Employee(33, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Prayagraj", "400614", "Uttar Pradesh", "India"), new UserCredential("ram", "ram")));
			employeeRepository.save(new Employee(31, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Banaras", "400615", "Uttar Pradesh", "India"), new UserCredential("prabhas", "prabhas")));
			employeeRepository.save(new Employee(28, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Kolhapur", "400616", "Maharashtra", "India"), new UserCredential("arjun", "arjun")));
			employeeRepository.save(new Employee(33, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Rajsathan", "400617", "Gurjat", "India"), new UserCredential("sudhir", "sudhir")));
			employeeRepository.save(new Employee(48, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Jodhpur", "400618", "Gurjat", "India"), new UserCredential("bablu", "bablu")));
			employeeRepository.save(new Employee(29, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Hariyana", "400619", "Punjab", "India"), new UserCredential("shan", "shan")));
			employeeRepository.save(new Employee(30, 600000, LocalDate.now(), "INACTIVE", department2,
					new Address("Gurugram", "400620", "Punjab", "India"), new UserCredential("manoj", "manoj")));	
		};
	}
}
