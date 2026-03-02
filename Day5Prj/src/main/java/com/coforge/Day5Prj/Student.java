package com.coforge.Day5Prj;

public class Student implements Comparable<Student> {
    private int stuid;
    private String studName;
    private double marks;
	public Student() {
		super();
	}
	public Student(int stuid, String studName, double marks) {
		super();
		this.stuid = stuid;
		this.studName = studName;
		this.marks = marks;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", studName=" + studName + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.stuid-o.stuid;
	}
	
    
}
