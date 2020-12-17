package com.spring.crud.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="JOB_HISTORY")
public class JobHistoryEntity implements Serializable{

	@EmbeddedId
	private PKJobHistory miPK;
	
	
	/*@Id
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;
	
	@Id
	@Column(name = "START_DATE")
	private Date startDate;*/

	@Column(name = "END_DATE")
	private LocalDate endDate;
	
	@Column(name = "JOB_ID")
	private String jobId;
	
	@Column(name = "DEPARTMENT_ID")
	private int departmentId;
	
	


	public JobHistoryEntity() {	}

	
	public JobHistoryEntity(PKJobHistory miPK, LocalDate endDate, String jobId, int departmentId) {
		super();
		this.miPK = miPK;
		this.endDate = endDate;
		this.jobId = jobId;
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "JobHistoryEntity [miPK=" + miPK + ", endDate=" + endDate + ", jobId=" + jobId + ", departmentId="
				+ departmentId + "]";
	}

	public PKJobHistory getMiPK() {
		return miPK;
	}



	public void setMiPK(PKJobHistory miPK) {
		this.miPK = miPK;
	}



	public LocalDate getEndDate() {
		return endDate;
	}



	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}



	public String getJobId() {
		return jobId;
	}



	public void setJobId(String jobId) {
		this.jobId = jobId;
	}



	public int getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	
}
