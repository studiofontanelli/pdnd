package it.csi.staris.pdnd.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.XmlSerializer;
import it.csi.util.performance.StopWatch;

/**
 * Classe comune a tutti gli aspetti
 * @author andreafontanelli
 *
 */
public class CommonAspect {

	protected static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".aspect";

	protected static final Logger LOG = LoggerFactory.getLogger(LOGGER_PREFIX);
	protected StopWatch stopWatch = null;

	public Object stopWatchAspect(ProceedingJoinPoint joinPoint, boolean showResult) throws Throwable {
		String className = joinPoint.getTarget().getClass().getName();
		String method = joinPoint.getSignature().getName();
		stopWatch = new StopWatch(LOGGER_PREFIX);
		try {
			stopWatch.start();
			Object result = joinPoint.proceed();
			if(showResult) {
				if(LOG.isDebugEnabled()) {
					Tracer.debug(LOG, className, method, "out:\n ");
					Tracer.debug(LOG, className, method, XmlSerializer.objectToXml(result));
				}
			}
			return result;
		}finally {
			stopWatch.stop();
			stopWatch.dumpElapsed(className, method, "tempo esecuzione di [" +LOGGER_PREFIX+"]::["  + method + "]", "(ASPECT)");
		}
	}

	public Object stopWatchAspect(ProceedingJoinPoint joinPoint) throws Throwable {
		return stopWatchAspect(joinPoint, false);
	}

	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		beforeAspect(joinPoint, true);
	}

	public void beforeAspect(JoinPoint joinPoint, boolean traceParam) throws Throwable {
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();
		Tracer.debug(LOG, className, method, "BEGIN");
		if(traceParam) {
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, className, method, "in:");
				for(int i = 0; i<joinPoint.getArgs().length; i++ ) {
					Tracer.debug(LOG, className, method, "arg[" + i + "]:\n " + XmlSerializer.objectToXml(joinPoint.getArgs()[i]));

				}
			}
		}
	}

	public void afterAspect(JoinPoint joinPoint) throws Throwable {
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();
		Tracer.debug(LOG, className, method, "END");
	}

	public void afterThrowingAspect(JoinPoint joinPoint, Exception ex) throws Throwable {

		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();

		Tracer.error(LOG, className, method, "ASPECT TRACER");
		Tracer.error(LOG, className, method, "Si e' verificato un errore: " + ex);
		Tracer.info(LOG, className, method, "trace params:");
		for(int i = 0; i<joinPoint.getArgs().length; i++ ) {
			Tracer.info(LOG, className, method, "arg[" + i + "]: ");
			Tracer.debug(LOG, className, method, joinPoint.getArgs()[i]);
		}
		throw ex;
	}
}