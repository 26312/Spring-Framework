package com.SpringFramework.Spring_InjectingObjects;

public class Triangle {

	private Points pointA;
	private Points pointB;
	private Points pointC;
	
	//Setters
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}
	
	//Getters
	public Points getPointA() {
		return pointA;
	}	
	public Points getPointB() {
		return pointB;
	}	
	public Points getPointC() {
		return pointC;
	}
	
public void Triangle() {
	System.out.println("Equilateral Triangle: (" + getPointA().getX() + "," + getPointA().getY() + "," + getPointA().getZ() + ")");
	System.out.println("Isosceles Triangle: (" + getPointB().getX() + "," + getPointB().getY() + "," + getPointB().getZ() + ")");
	System.out.println("Right-Angles Triangle: (" + getPointC().getX() + "," + getPointC().getY() + "," + getPointC().getZ() + ")");
	}
	
	
	
}
