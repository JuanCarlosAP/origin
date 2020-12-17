package com.spring.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="DEPARTMENTS")
public class Department {
	
	@Column(name ="DEPARTMENT_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DEPARTMENTS_SEQ")
    @SequenceGenerator(name="DEPARTMENTS_SEQ", sequenceName = "DEPARTMENTS_SEQ", allocationSize=1)
	private Integer departmentId;
	
	
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	
	
	@Column(name = "MANAGER_ID")
	private Integer managerId;
	
	@Column(name = "LOCATION_ID")
	private Integer locationId;
	
	
	
	public Department() {} 
	
	public Department(Integer departmentId, String departmentName, Integer managerId, Integer locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.locationId = locationId;
		
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}


	@Override
	public String toString() {
		return "DepartmentEntity [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationId=" + locationId + "]";
	}

	
	
}
