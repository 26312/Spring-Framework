package com.SpringFramework.Spring_Pratice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Triangles Tri = (Triangles) context.getBean("newTriangles");
		Tri.draw();
	}
}
