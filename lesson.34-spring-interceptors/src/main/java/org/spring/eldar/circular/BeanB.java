package org.spring.eldar.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BeanB {

	public BeanA beanA;

	@Autowired
	public BeanB(BeanA beanA) {
		super();
		this.beanA = beanA;
	}

	
}
