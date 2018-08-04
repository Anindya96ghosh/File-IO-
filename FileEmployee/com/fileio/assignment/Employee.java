
package com.fileio.assignment;

import java.io.Serializable;

public class Employee  implements Serializable{
	private String name;
	private int empId;
	
	//Parameterized Constructors
	public Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//Overridden toString method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
}
