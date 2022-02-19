package edu.ycp.cs320.lab02a_ssanjuan1.model;

public class Numbers {
	
	private int first, second, third;
	double result;
	
	//setter
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setThird(int third) {
		this.third = third;
	}
	
	//getter
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public int getThird() {
		return third;
	}
	
	public void getResult(double result) {
		this.result = result;
	}
}
