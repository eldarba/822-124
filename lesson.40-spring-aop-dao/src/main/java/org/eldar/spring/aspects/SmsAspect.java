package org.eldar.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SmsAspect {

	@Before("MyPointcuts.allBeansPackageExcludeGetSet()")
	public void smsAdvice(JoinPoint jp) {
		System.out.println(">>> sms advice before method: " + jp.getSignature());
	}
}
