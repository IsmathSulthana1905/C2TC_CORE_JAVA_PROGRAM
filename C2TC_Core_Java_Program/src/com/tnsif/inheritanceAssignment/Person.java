package com.tnsif.inheritanceAssignment;

public class Person {
	private String Name;
	private int Age;
	private String City;
	//default constructor
	public Person()
	{
		this.Name="Ismath";
		this.Age=21;
		this.City="Villupuram";
	}
	//parameterized constructor
	public Person(String Name,int Age,String City)
	{
		this.Name=Name;
		this.Age=Age;
		this.City=City;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", City=" + City + "]";
	}

}
