package com.SPRINGFRAMEWORK.Spring_BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
       
       obj.getMessage1();
       obj.getMessage2();
       
       HelloIndia obj2 = (HelloIndia) context.getBean("HelloIndia");
       
       obj2.getMessage1();
       obj2.getMessage2();
       obj2.getMessage3();
       
    }
}
