package org.spring.eldar.interceptors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements 

BeanNameAware, BeanFactoryAware, ApplicationContextAware, // awareness interfaces

InitializingBean, DisposableBean // init destroy



{
	
	public String beanName;
	public BeanFactory factory;
	public ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		
	}
	
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


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("from InitializingBean.afterPropertiesSet");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("from DisposableBean.destroy");
	}


}
