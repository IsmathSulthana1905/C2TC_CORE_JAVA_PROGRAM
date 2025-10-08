package com.tnsif.assignment1_packagesaaAndmodifier.employee;

public class Developer extends Employee{
	
	private String ProgrammingLanguage;

	public Developer(String name, int employeeid, double salary, String programmingLanguage) {
		super(name, employeeid, salary);
		ProgrammingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return ProgrammingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		ProgrammingLanguage = programmingLanguage;
	}

	@Override
	public String toString() {
		return "Developer [ProgrammingLanguage=" + ProgrammingLanguage + "Name: " +super.getName()+ "Employeeid:" +super.getEmployeeid()+ " Salary:" +super.getSalary()+"]";
	}
	
	

}