package com.SpringFramework.Spring_DependancyInjection_ConstructorBased;

public class Triangle {

	private String type;
	private int height;
	
	// Getter for Type
	public String getType() {
		return type;
	}
	//Getter for Height
	public int getHeight() {
		return height;
	}
	
	// Class based Constructors
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	public Triangle(int height, String type ) {
		this.type = type;
		this.height = height;
	}
	
	public void getTriangle() {
		System.out.println("Type of Triangle:" + getType() + "\nHeight: " + getHeight());
	}
	
	
}
