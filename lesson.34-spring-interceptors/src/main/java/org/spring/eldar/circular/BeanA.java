package org.spring.eldar.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BeanA {

	public BeanB beanB;

	@Autowired
	public BeanA(BeanB beanB) {
		super();
		this.beanB = beanB;
	}

}
