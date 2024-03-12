package it.csi.staris.pdnd.business.aspect;


import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import it.csi.staris.pdnd.business.exception.HelperException;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.XmlSerializer;

/**
 * Aspetto per lo strato Helper
 * @author andreafontanelli
 *
 */
@Component("helperAspect")
@Aspect
public class HelperAspect extends CommonAspect{

	@Around(value = "execution(*  it.csi.staris.pdnd.business.helper.impl..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint, true);
	}

	@Before(value="execution(* it.csi.staris.pdnd.business.helper.impl..*.*(..))")
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		super.beforeAspect(joinPoint);
	}


	@Override
	@After(value="execution(* it.csi.staris.pdnd.business.helper.impl..*.*(..))")
	public void afterAspect(JoinPoint joinPoint) throws Throwable {
		super.afterAspect(joinPoint);
	}

	@Override
	@AfterThrowing (pointcut="execution(* it.csi.staris.pdnd.business.helper.impl..*.*(..))", throwing="ex" )
	public void afterThrowingAspect(JoinPoint joinPoint, Exception ex) throws Throwable {
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();
		Tracer.info(LOG, className, method, "HELPER TRACER");
		Tracer.error(LOG, className, method, "Si e' verificato un errore: " + ex);
		Tracer.info(LOG, className, method, "trace params:");
		for(int i = 0; i<joinPoint.getArgs().length; i++ ) {
			Tracer.info(LOG, className, method, "arg[" + i + "]:\n " + XmlSerializer.objectToXml(joinPoint.getArgs()[i]));
		}
		if(ex instanceof HelperException ) {
			HelperException ee = (HelperException)ex;

			// PULIZIA DESCRIZIONI SQL
			if(StringUtils.contains(ee.getMessage(), "org.postgresql.util.PSQLException")) {
				//if(StringUtils.contains(ee.getMessage(), "ORA-")) {
				Tracer.info(LOG, className, method, "ERRORE IN FASE DI ACCESSO AI DATI");
				HelperException newEe = new HelperException("Errore in fase di accesso ai dati", ee.getErrorDetails());
				throw newEe;
			}
			Tracer.error(LOG, className, method, "ErrorDetail\n " + XmlSerializer.objectToXml(((HelperException)ex).getErrorDetails()));
			//Tracer.error(LOG, className, method, "ErrorDetail\n " + ((HelperException)ex).getErrorDetails());
		}
		throw ex;
	}
}