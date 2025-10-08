package com.tnsif.assignment1_packagesaaAndmodifier.employee;

public class Employee {
	
	private String Name;
	private int Employeeid;
	private double Salary;
	
	
	public Employee(String name, int employeeid, double salary) {
		
		Name = name;
		Employeeid = employeeid;
		Salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Employeeid=" + Employeeid + ", Salary=" + Salary + "]";
	}
	
	
	
	
	

}