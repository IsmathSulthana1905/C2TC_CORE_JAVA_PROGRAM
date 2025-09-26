package com.tnsif.entityclass;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.setPid(201);
		p1.setPname("Laptop");
		p1.setPrice(55000);
		System.out.println(p1);
		
		Product p2=new Product();
		p2.setPid(202);
		p2.setPname("Smartphone");
		p2.setPrice(25000);
		System.out.println(p2);
		
		Product p3=new Product();
		p3.setPid(203);
		p3.setPname("Headphones");
		p3.setPrice(5000);
		System.out.println(p3);
	}
	

}
