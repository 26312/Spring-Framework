package com.SpringFramework.Spring_Pratice;

public class Triangles {
	
	private Points pointA,pointB,pointC;

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

	public void draw() {
		System.out.println("Isoceles Triangle:(" + getPointA().getX() + "," + getPointA().getY() + "," + getPointA().getZ() + ")");
		System.out.println("Sclable Trianlge:(" + getPointB().getX() + "," + getPointB().getY() + "," + getPointB().getZ() + ")");
		System.out.println("Right-Angled Triangle:(" + getPointC().getX() + "," + getPointC().getY() + "," + getPointC().getZ() +")");
		
	}
	


	
}
