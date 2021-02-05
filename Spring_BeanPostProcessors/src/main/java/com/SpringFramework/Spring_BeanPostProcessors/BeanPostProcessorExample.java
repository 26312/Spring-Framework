package com.SpringFramework.Spring_BeanPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorExample implements BeanPostProcessor{
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before Initialization :" + beanName);
		
		return bean;
		
	}
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("In After Initialization : " + beanName);
		
		return bean;
		
	}

}
