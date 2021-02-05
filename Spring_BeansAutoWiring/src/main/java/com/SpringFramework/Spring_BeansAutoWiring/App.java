package com.SpringFramework.Spring_BeansAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // AutoWire byName
//    	ApplicationContext context = new ClassPathXmlApplicationContext("AWbyName.xml");
//        BeanAutoWireByName tri = (BeanAutoWireByName) context.getBean("BeanAutoWireByName");
//        tri.display();
        
        //AutoWire byType
//        ApplicationContext context = new ClassPathXmlApplicationContext("AWbyType.xml");
//        BeanAutoWireByType tri = (BeanAutoWireByType) context.getBean("BeanAutoWireByType");
//        tri.display();
    	
    	//AutoWire byConstructor
    	ApplicationContext context = new ClassPathXmlApplicationContext("AWbyConstructor.xml");
    	BeanAutoWireByConstructor tri = (BeanAutoWireByConstructor) context.getBean("BeanAutoWireByConstructor");
    	tri.display();
    	
    	
        
    }
}
