package org.eldar.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyPrototype {

	public int x = (int) (Math.random()*101);
}
