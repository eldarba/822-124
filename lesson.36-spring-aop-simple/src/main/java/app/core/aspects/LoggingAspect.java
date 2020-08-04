package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	// ====================== advices ==============
	@Before("allMethods()")
	public void beforeLogAdvice(JoinPoint jp) {
		System.out.println(">>> @Before advice on method: " + jp.getSignature());
	}

	@AfterReturning(pointcut = "exactSumMethod()", returning = "res")
	public void afterReturningLogAdvice(JoinPoint jp, Object res) {
		System.out.println(">>> @AfterReturning advice on method: " + jp.getSignature() + ": " + res);
	}

	@AfterThrowing(pointcut = "allMethods()", throwing = "e")
	public void afterThrowLogAdvice(JoinPoint jp, Throwable e) {
		System.out.println(">>> @AfterThrowing advice on method: " + jp.getSignature() + ": " + e);
	}

	@After("exactSumMethod()")
	public void afterFinalyLogAdvice(JoinPoint jp) {
		System.out.println(">>> @After(finaly) advice on method: " + jp.getSignature());
	}

	@Around("exactSumMethod()")
	public Object aroundLogAdvice(ProceedingJoinPoint pjp) throws Throwable {
		// before
		System.out.println(">>> @Around(before) advice on method: " + pjp.getSignature());
		try {
			// proceed - invoke target method
			Object res = pjp.proceed();
			// after
			System.out.println(">>> @Around(after returning) advice on method: " + pjp.getSignature());
			return res; // advice return the result to caller
		} catch (Throwable e) {
			System.out.println(">>> @Around(after throwing) advice on method: " + pjp.getSignature());
			System.out.println("Advice Error: " + e);
//			return -1;
			throw e;
		}
	}

	// ===================== pointcut declarations ==========================
	@Pointcut("execution(* *(..))")
	public void allMethods() {
	}

	@Pointcut("execution(public int app.core.target.MyTargetObject.sum(int, int))")
	public void exactSumMethod() {
	}

}
