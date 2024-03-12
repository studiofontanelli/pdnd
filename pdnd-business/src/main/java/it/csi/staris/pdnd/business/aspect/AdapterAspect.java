package it.csi.staris.pdnd.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Aspetto per lo strato adapter
 * @author andreafontanelli
 *
 */
@Component("adapterAspect")
@Aspect
public class AdapterAspect extends CommonAspect{

	@Override
	@Before(value="execution(* it.csi.stariv.starivbl.business.adapter.impl..*.*(..))")
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		super.beforeAspect(joinPoint);
	}

	@Override
	@After(value="execution(* it.csi.stariv.starivbl.business.adapter.impl..*.*(..))")
	public void afterAspect(JoinPoint joinPoint) throws Throwable {
		super.afterAspect(joinPoint);
	}


}