package com.SpringFramework.Spring_BeanLifeCycle;

public class BeanCycleExample {

	private String name;

	public void getName() {
		
		System.out.println("Bean Life Cycle :"); 
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("Bean is going through the initialization phase");
	}
	
	public void destroy() {
		System.out.println("Bean will be destroyed now");
	}
}
