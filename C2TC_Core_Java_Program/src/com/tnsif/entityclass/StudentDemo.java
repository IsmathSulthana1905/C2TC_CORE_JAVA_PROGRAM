package com.tnsif.entityclass;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("Ismath");
		s1.setCourse("Java");
		System.out.println(s1);
		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("Isaq");
		s2.setCourse("Python");
		System.out.println(s2);
		Student s3 = new Student();
		s3.setSid(103);
		s3.setSname("Syed");
		s3.setCourse("C++");
		System.out.println(s3);
	}

}
