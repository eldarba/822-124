package org.eldar.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyComposit {

	@Autowired
	public MyPrototype proto;
	@Autowired
	public MySingleton single;
}
