package net.nadisa.anan.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	@Pointcut("execution(* net.nadisa.anan.*.*.*(..))")
	private void generalPointcut() {
		
	}
	 
	@Before("generalPointcut()")
	public void infoLog(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget().getClass().getSimpleName()+" : "+joinPoint.getSignature().getName());
	}
	
}
