package com.SpringFramework.Spring_BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	BeanCycleExample obj = (BeanCycleExample) context.getBean("name");
    	obj.getName();
    	context.registerShutdownHook();
    	
    }
}

