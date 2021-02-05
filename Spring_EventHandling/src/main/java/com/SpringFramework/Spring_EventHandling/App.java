package com.SpringFramework.Spring_EventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       
       context.start();
       
       HelloWorld obj = (HelloWorld) context.getBean("Events");
       
       obj.getName();
       
       context.stop();
       
    }
}
