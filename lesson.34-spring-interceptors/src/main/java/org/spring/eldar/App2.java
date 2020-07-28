package org.spring.eldar;

import org.spring.eldar.interceptors.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			MyBean bean = ctx.getBean(MyBean.class);
		}
	}

}
