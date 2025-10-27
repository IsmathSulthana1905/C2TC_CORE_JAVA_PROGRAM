package com.tnsif.exceptionexample;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x[]= {23,45,11};
		int c;
		try {
			c=x[4];//exception object throwing
			System.out.println("C="+c);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			c=x[2];//exception object throwing
			System.out.println("C="+c);
		}
		System.out.println("nextline");
		// TODO Auto-generated method stub
		

	}

}
