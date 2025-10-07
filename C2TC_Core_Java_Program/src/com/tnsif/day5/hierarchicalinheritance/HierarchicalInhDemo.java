package com.tnsif.day5.hierarchicalinheritance;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Ismath", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Sulthana", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Syed", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}
