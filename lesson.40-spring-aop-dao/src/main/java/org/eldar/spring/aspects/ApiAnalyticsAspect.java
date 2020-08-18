package org.eldar.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ApiAnalyticsAspect {

	private int counter;

	@Before("MyPointcuts.allDaoPackageExcludeGetSet()")
	public void apiAnalyticsAdvice(JoinPoint jp) {
		counter++;
		System.out.println(
				"===>>> API Analytics advice before method: " + jp.getSignature() + " interception #: " + counter);
	}

	public int getCounter() {
		return counter;
	}

}
