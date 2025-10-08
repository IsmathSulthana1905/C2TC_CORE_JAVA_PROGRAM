package com.tnsif.assignment1_packagesaaAndmodifier.employee;

public class Manager extends Employee {
	private String Department;

	public Manager(String name, int employeeid, double salary, String department) {
		super(name, employeeid, salary);
		Department = department;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Manager [Department=" + Department + "Name: " +super.getName()+ "Employeeid:" +super.getEmployeeid()+ " Salary:" +super.getSalary()+"]";
	}

}
