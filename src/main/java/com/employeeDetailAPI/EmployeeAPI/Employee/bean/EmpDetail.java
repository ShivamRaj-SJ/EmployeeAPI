package com.employeeDetailAPI.EmployeeAPI.Employee.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmpDetail {
	@Id
	@GeneratedValue
	long id;
	String empName;
	long salary;
	String empAddress;
	String dep;
	public EmpDetail(long id, String empName, long salary, String empAddress, String dep) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.empAddress = empAddress;
		this.dep = dep;
	}
	public EmpDetail(){}
	
	public long getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public long getSalary() {
		return salary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public String getDep() {
		return dep;
	}
	

//	public void setId(long id) {
//		this.id = id;
//	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
//	@Override
//	public String toString() {
//		return "EmpDetail [id=" + id + ", empName=" + empName + ", salary=" + salary + ", empAddress=" + empAddress
//				+ ", dep=" + dep + "]";
//	}
	

}
