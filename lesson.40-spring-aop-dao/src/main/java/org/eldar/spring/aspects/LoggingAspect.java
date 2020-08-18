package org.eldar.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// the action of logging operation is a cross-cutting concern
// cross-cutting concerns are defined in an aspect

@Aspect
@Component
@Order(3)
public class LoggingAspect {

	// an advice is a method to be run when a joinpont is executed
//	@Before("execution(public void add*())") // pointcut expression language
//	@Before("execution(public void add*(org.eldar.spring.beans.Company))") // pointcut expression language
//	@Before("execution(public void add*(*))") // pointcut expression language
//	@Before("execution(public void add*(..))") // pointcut expression language
//	public void beforeAddAdvice() {
//		System.out.println("===>>> LoggingAspect: ");
//	}

	@Before("MyPointcuts.allDaoPackageExcludeGetSet()")
	public void beforeDaoPackageAdvice(JoinPoint jp) {
		System.out.println("===>>> LoggingAspect: you called a method from beans package: " + jp.getSignature());
	}

	// annotation on method
	@Before("@annotation(org.eldar.spring.myAnnotations.MyLogAnnotation)")
	public void beforeAnnotatedMethod(JoinPoint jp) {
		System.out.println("===>>> method@@@@@@@@ LoggingAspect: you called an annotated method: " + jp.getSignature());
	}

	// annotation on class
	@Before("@target(org.eldar.spring.myAnnotations.MyLogAnnotation)")
	public void beforeAnnotatedClass(JoinPoint jp) {
		System.out.println(
				"===>>> class@@@@@@@@ LoggingAspect: you called a method in annotated class: " + jp.getSignature());
	}

}
