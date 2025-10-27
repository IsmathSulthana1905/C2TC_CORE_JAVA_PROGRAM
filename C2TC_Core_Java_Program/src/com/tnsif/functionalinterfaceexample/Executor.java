package com.tnsif.functionalinterfaceexample;

public class Executor {
	public static void main(String[] args) {
		Message m1= (n)->{ System.out.println("Enter Greeting: "+n);};
		m1.greeting("Welcome");
	}

}