package com.tnsif.ConstructorExample;

public class Student {
	private int sid;
	private String sname;
	//Default Constructor
	public Student()
	{
		this.sid=100;
		this.sname="IFET Student";
	}
	//parameterized constructor
	public Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
