package org.eldar.spring.scope;

import org.springframework.stereotype.Component;

@Component
public class MySingleton {

	public int x = (int) (Math.random()*101);
}
