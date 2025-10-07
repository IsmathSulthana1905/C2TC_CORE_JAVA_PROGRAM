package com.tnsif.inheritanceAssignment;
public class Executor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person  p= new Person("Ismath",21,"Villupuram");
		System.out.println(p);
		Student s= new Student("Ismath",21,"Villupuram",34,"Java");
		System.out.println(s);
		Teacher t= new Teacher(4034,"B.E","Morning");
		System.out.println(t);
	}

}
