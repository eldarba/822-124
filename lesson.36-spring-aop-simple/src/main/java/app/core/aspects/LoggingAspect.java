package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	public void afterLogAdvice(JoinPoint jp, int res) {
		System.out.println(">>> @AfterReturning advice on method: " + jp.getSignature() + ": " + res);
	}

	@AfterThrowing(pointcut = "allMethods()", throwing = "e")
	public void afterThrowLogAdvice(JoinPoint jp, Throwable e) {
		System.out.println(">>> @AfterThrowing advice on method: " + jp.getSignature() + ": " + e);
	}

	// ===================== pointcut declarations ==========================
	@Pointcut("execution(* *(..))")
	public void allMethods() {
	}

	@Pointcut("execution(public int app.core.target.MyTargetObject.sum(int, int))")
	public void exactSumMethod() {
	}

}
