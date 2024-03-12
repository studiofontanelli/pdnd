package it.csi.staris.pdnd.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Aspetto per lo strato di Integration
 * @author andreafontanelli
 *
 */
@Component("integrationAspect")
@Aspect
public class IntegrationAspect extends CommonAspect {
	
	
	@Override
	@Before(value="execution(*  it.csi.staris.pdnd.integration..*.*(..))")
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		super.beforeAspect(joinPoint, true);
	}

	@Override
	@After(value="execution(*  it.csi.staris.pdnd.integration..*.*(..))", argNames = "joinPoint")
	public void afterAspect(JoinPoint joinPoint) throws Throwable {
		super.afterAspect(joinPoint);
	}
	
	@Around(value = "execution(*  it.csi.staris.pdnd.integration..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint, true);
	}
	

}