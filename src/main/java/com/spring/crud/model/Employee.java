package com.spring.crud.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	
	@Column(name = "EMPLOYEE_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="EMPLOYEES_SEQ")
    @SequenceGenerator(name="EMPLOYEES_SEQ", sequenceName = "EMPLOYEES_SEQ", allocationSize=1)
	private Integer employeeId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	

	@Column(name = "HIRE_DATE") //Errores con el formato!
	LocalDate hireDate;
	
	@Column(name = "JOB_ID")
	private String jobId;
	
	@Column(name = "SALARY")
	private float salary;
	
	@Column(name = "COMMISSION_PCT")
	private Integer commisionPct;
	
	@Column(name = "MANAGER_ID")
	private Integer  managerId;
	
	@Column(name = "DEPARTMENT_ID")
	private Integer departmentId;
	
	
	
	
	public Employee() {	}
	
	

	public Employee(Integer employeeId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, String jobId, float salary, Integer commisionPct, Integer managerId, Integer departmentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commisionPct = commisionPct;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Integer getCommisionPct() {
		return commisionPct;
	}

	public void setCommisionPct(Integer commisionPct) {
		this.commisionPct = commisionPct;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary="
				+ salary + ", commisionPct=" + commisionPct + ", managerId=" + managerId + ", departmentId="
				+ departmentId + "]";
	}

	
	
}
