package com.SpringFramework.Spring_BeansAutoWiring;

public class BeanAutoWireByName {
	
	private Points pointA;
	private Points pointB;
	private Points pointC;
	
	public Points getPointA() {
		return pointA;
	}
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public Points getPointB() {
		return pointB;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	public Points getPointC() {
		return pointC;
	}
	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}

	public void display() {
		
		System.out.println("PointA:( " + getPointA().getX() + "," + getPointA().getY() + "," +  getPointA().getZ() + ")");
		System.out.println("PointB:( " + getPointB().getX() + "," + getPointB().getY() + "," +  getPointB().getZ() + ")");
		System.out.println("PointC:( " + getPointC().getX() + "," + getPointC().getY() + "," +  getPointC().getZ() + ")");

		
	}
}
