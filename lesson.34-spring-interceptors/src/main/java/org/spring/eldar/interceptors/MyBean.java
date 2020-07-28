package org.spring.eldar.interceptors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("aaa")
public class MyBean implements BeanNameAware, BeanFactoryAware {
	
	public String beanName;
	public BeanFactory factory;

	@Override
	public void setBeanName(String name) {
		beanName = name;
		System.out.println("name aware");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.factory = beanFactory;
		System.out.println("beanFactory aware");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("from myInit method - doing some initializion stuff");
	}
	
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("from myDestroyMethod method - doing some cleanup stuff");
	}

}
