package com.SpringFramework.Spring_BeanPostProcessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BeanExample obj = (BeanExample) context.getBean("Pointer");
        obj.getMessage();
        context.registerShutdownHook();
    
    }
}
