package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	// advice method (with pointcut expression)
	@Before("exactSumMethod()")
	public void beforeLogAdvice(JoinPoint jp) {
		System.out.println(">>> @Before advice on method: " + jp);
	}

	// pointcut declaration
	@Pointcut("execution(* *(..))")
	public void allMethods() {
	}

	@Pointcut("execution(public int app.core.target.MyTargetObject.sum(int, int))")
	public void exactSumMethod() {

	}

}
