package com.SpringFramework.Spring_BeansAutoWiring;

public class BeanAutoWireByType {
	
	private Points point;
	
	public void setPoint(Points point) {
		this.point = point;
	}

	public Points getPoint() {
		return point;
	}
	
	public void display() {
		System.out.println("Point: (" + getPoint().getX() + "," + getPoint().getY() + "," + getPoint().getZ() + ")" );
	}
}
