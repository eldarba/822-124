package org.eldar.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// the action of logging operation is a cross-cutting concern
// cross-cutting concerns are defined in an aspect

@Aspect
@Component
public class LoggingAspect {

	// an advice is a method to be run when a joinpont is executed
//	@Before("execution(public void add*())") // pointcut expression language
//	@Before("execution(public void add*(org.eldar.spring.beans.Company))") // pointcut expression language
//	@Before("execution(public void add*(*))") // pointcut expression language
	@Before("execution(public void add*(..))") // pointcut expression language
	public void beforeAddAdvice() {
		System.out.println("===>>> LoggingAspect: ");
	}

	@Before("execution(* org.eldar.spring.beans.*.*(..))")
	public void beforeBeansPackageAdvice() {
		System.out.println("===>>> LoggingAspect: you called a method from beans package");
	}

}
