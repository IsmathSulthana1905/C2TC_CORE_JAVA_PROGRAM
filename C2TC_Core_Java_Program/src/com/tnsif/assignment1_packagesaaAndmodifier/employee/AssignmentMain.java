package com.tnsif.assignment1_packagesaaAndmodifier.employee;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e; 
        e = new Manager("Ismath", 100, 70000, "HR");
        if (e instanceof Manager) {
            System.out.println("Manager Details: " + e);
        }        
        e = new Developer("Sulthana", 110, 80000, "Core Java");
        if (e instanceof Developer) {
            System.out.println("Developer Details:" + e);
}

	}

}
