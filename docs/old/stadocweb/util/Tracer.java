/**
 * 
 */
package it.csi.staris.pdnd.util;
import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;


/**
 * @author Il Fonta
 *
 * 
 */
public class Tracer implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -3052270659427671821L;

	private static final String separator = "::";		
	public static Tracer _Tracer;


	
	public static void write(String className,	String methodName,String msg) {

		String row ="Class : "+ className + " | Method : " 
		+ methodName + " | Message :" + msg;
		
		System.out.print(createOutput(className,methodName,msg).toString() + "\n");
		
	}

	/**
	 * 	  
	 * @deprecated
	 * 
	 */
	public static void writeWithTime(String className,	String methodName,String msg) {

		String row ="TIME="+(new Timestamp(System.currentTimeMillis())).toString()+" Class : "+ className + " | Method : " 
		+ methodName + " | Message :" + msg;
		
	}

	/**
	 * 	  
	 * @deprecated
	 * 
	 */
	public static Tracer getInstance(){

		if (_Tracer !=null)
			return _Tracer;
		else {
			//_Tracer = new Tracer();
			return _Tracer;
		}
	}		


	public static void debug(Logger log, String className, String methodName, String msg) throws TracerException {
		debug(log, className, methodName, msg, null);
	}
	public static void debug(Log log, String className, String methodName, String msg) throws TracerException {
		debug(log, className, methodName, msg, null);
	}

	public static void debug(Logger log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				if (log.isDebugEnabled()) {
					log.debug(createOutput(className,methodName,msg));
					if (optionalObject != null) 
						log.debug(optionalObject);
				}

			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void debug(Log log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				if (log.isDebugEnabled()) {
					log.debug(createOutput(className,methodName,msg));
					if (optionalObject != null) 
						log.debug(optionalObject);
				}

			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}


	public static void info(Logger log, String className, String methodName, String msg) throws TracerException {
		info(log, className, methodName, msg, null);
	}
	public static void info(Log log, String className, String methodName, String msg) throws TracerException {
		info(log, className, methodName, msg, null);
	}

	public static void info(Logger log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				if (log.isInfoEnabled()) {
					log.info(createOutput(className,methodName,msg));
					if (optionalObject != null) 
						log.info(optionalObject);
				}
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}
	public static void info(Log log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				if (log.isInfoEnabled()) {
					log.info(createOutput(className,methodName,msg));
					if (optionalObject != null) 
						log.info(optionalObject);
				}
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}


	public static void warn(Logger log, String className, String methodName, String msg) throws TracerException {
		warn(log, className, methodName, msg, null);
	}

	public static void warn(Log log, String className, String methodName, String msg) throws TracerException {
		warn(log, className, methodName, msg, null);
	}

	public static void warn(Logger log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {

				log.warn(createOutput(className,methodName,msg));
				if (optionalObject != null) 
					log.warn(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void warn(Log log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {

				log.warn(createOutput(className,methodName,msg));
				if (optionalObject != null) 
					log.warn(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}


	public static void error(Logger log, String className, String methodName, Throwable ex) throws TracerException {
		error(log, className, methodName, null, ex, null);
	}

	public static void error(Logger log, String className, String methodName, String msg, Throwable ex) throws TracerException {
		error(log, className, methodName, msg, ex, null);
	}	

	public static void error(Log log, String className, String methodName, Throwable ex) throws TracerException {
		error(log, className, methodName, null, ex, null);
	}

	public static void error(Log log, String className, String methodName, String msg, Throwable ex) throws TracerException {
		error(log, className, methodName, msg, ex, null);
	}

	public static void error(Logger log, String className, String methodName, String msg, Throwable ex, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				log.error(createOutput(className,methodName,msg), ex);	
				if (optionalObject != null) 
					log.error(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void error(Log log, String className, String methodName, String msg, Throwable ex, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				log.error(createOutput(className,methodName,msg), ex);	
				if (optionalObject != null) 
					log.error(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void error(Logger log, String className, String methodName,String msg) throws TracerException {
		error(log, className, methodName, msg, null);
	}

	public static void error(Log log, String className, String methodName,String msg) throws TracerException {
		error(log, className, methodName, msg, null);
	}

	public static void error(Logger log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {

				log.error(createOutput(className,methodName,msg));
				if (optionalObject != null) 
					log.error(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void error(Log log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {

				log.error(createOutput(className,methodName,msg));
				if (optionalObject != null) 
					log.error(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}


	public static void fatal(Logger log, String className, String methodName, Throwable ex) throws TracerException {
		fatal(log, className, methodName, null, ex, null);
	}

	public static void fatal(Logger log, String className, String methodName, String msg, Throwable ex) throws TracerException {
		fatal(log, className, methodName, msg, ex, null);
	}

	public static void fatal(Log log, String className, String methodName, Throwable ex) throws TracerException {
		fatal(log, className, methodName, null, ex, null);
	}

	public static void fatal(Log log, String className, String methodName, String msg, Throwable ex) throws TracerException {
		fatal(log, className, methodName, msg, ex, null);
	}

	public static void fatal(Logger log, String className, String methodName, String msg, Throwable ex, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				log.fatal(createOutput(className,methodName,msg), ex);	
				if (optionalObject != null) 
					log.fatal(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void fatal(Log log, String className, String methodName, String msg, Throwable ex, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				log.fatal(createOutput(className,methodName,msg), ex);	
				if (optionalObject != null) 
					log.fatal(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void fatal(Logger log, String className, String methodName, String msg) throws TracerException {
		fatal(log, className, methodName, msg, null);
	}

	public static void fatal(Log log, String className, String methodName, String msg) throws TracerException {
		fatal(log, className, methodName, msg, null);
	}

	public static void fatal(Logger log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				log.fatal(createOutput(className,methodName,msg));
				if (optionalObject != null) 
					log.fatal(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	public static void fatal(Log log, String className, String methodName, String msg, Object optionalObject) throws TracerException {
		if(log != null){
			try {
				log.fatal(createOutput(className,methodName,msg));
				if (optionalObject != null) 
					log.fatal(optionalObject);
			} catch (Exception e) {
				throw new TracerException();
			}
		}
	}

	/**
	 * 
	 * @param className
	 * @param methodName
	 * @param msg
	 * @return
	 * @throws TracerException
	 */
	private static StringBuffer createOutput(String className, String methodName, String msg) throws TracerException {


		int index = className.lastIndexOf(".");
		if(index != -1){
			className = className.substring(index + 1, className.length());

		}
		StringBuffer sb = new StringBuffer("[" + className);
		sb.append(separator);
		sb.append(methodName);
		sb.append("]");
		sb.append(" ");
		if (msg!=null) {
			sb.append(msg);	
		}
		return sb;		
	}

}
