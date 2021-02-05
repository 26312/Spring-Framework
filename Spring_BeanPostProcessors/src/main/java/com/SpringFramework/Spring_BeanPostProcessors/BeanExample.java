package com.SpringFramework.Spring_BeanPostProcessors;

public class BeanExample {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("This is the BeanExample class " + message);
	}
	
	public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy(){
	      System.out.println("Bean will be destroyed now.");
	   }
}
