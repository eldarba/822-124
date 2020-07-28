package org.spring.eldar.interceptors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor2 implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof MyBean) {
			System.out.println("*** postProcessBeforeInitialization: " + beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof MyBean) {
			System.out.println("***1 postProcessAfterInitialization: " + beanName);
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 1;
	}
	
	

}
