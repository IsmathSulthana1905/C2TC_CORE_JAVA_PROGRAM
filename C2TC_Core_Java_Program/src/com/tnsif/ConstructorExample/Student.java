package com.tnsif.ConstructorExample;

public class Student {
	private int Sid;
	private String sname;
	//Default Constructor
	public Student()
	{
		this.Sid=100;
		this.sname="IFET Student";
	}
	//parameterized constructor
	public Student(int sid,String sname)
	{
		this.Sid=Sid;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", sname=" + sname + "]";
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
