package edu.ycp.cs320.lab02a_ssanjuan1.controller;

import edu.ycp.cs320.lab02a_ssanjuan1.model.Numbers;
import edu.ycp.cs320.lab02a_ssanjuan1.model.GuessingGame;

public class NumbersController {
	
	private Numbers model;
	
	public Double add(Double first, Double second, Double third) {
		return first + second + third;
	}
	
	public Double multiply(Double first, Double second) {
		return first * second;
	}
	
	public void setModel(Numbers model) {
		this.model = model;
	}
}
