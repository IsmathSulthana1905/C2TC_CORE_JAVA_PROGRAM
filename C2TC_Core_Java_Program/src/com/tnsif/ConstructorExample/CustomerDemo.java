package com.tnsif.ConstructorExample;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.setSid(101);
		c1.setSname("Ismath");
		c1.setScity("Villupuram");
		System.out.println(c1);
		Customer c2=new Customer();
		System.out.println(c2);
		Customer c3=new Customer(99,"Ismath","Chennai");//invoke the parameterized constructor
		System.out.println(c3);
	}

}
