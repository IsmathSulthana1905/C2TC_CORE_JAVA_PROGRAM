package com.tnsif.day5.inheritanceexample;

public class College {
	private String CollegeName;
	private String Location;
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + ", Location=" + Location + "]";
	}
	
}
