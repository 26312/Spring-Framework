package com.SpringFramework.Spring_DependancyInjection_ConstructorBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       Triangle tri = (Triangle) context.getBean("Triangle");
       tri.getTriangle();
    }
}
