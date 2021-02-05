package com.SpringFramework.Spring_BeansAutoWiring;

public class BeanAutoWireByConstructor {
	
	private Points point;
	
	
	public BeanAutoWireByConstructor(Points point) {
		this.point = point;
	}
	
	public void setPoint(Points point) {
		this.point = point;
	}
	
	public Points getPoint() {
		return point;
	}

	public void display() {
		
		System.out.println("Points: (" + point.getX() + "," + point.getY() + "," + point.getZ() + ")" );
		
	}
	
	
	
	
		
		
}
	

