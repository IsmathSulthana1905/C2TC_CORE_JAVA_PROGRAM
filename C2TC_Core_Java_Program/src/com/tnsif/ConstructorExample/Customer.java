package com.tnsif.ConstructorExample;

public class Customer {
	private int sid;
	private String sname;
	private String scity;
	//Default Constructor
	public Customer()
	{
		this.sid=102;
		this.sname="Priya";
		this.scity="Pondy";
	}
	//Parameterized Constructor
	public Customer(int sid,String sname,String scity)
	{
		this.sid=sid;
		this.sname=sname;
		this.scity=scity;
	}
	@Override
	public String toString() {
		return "Customer [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	

}
