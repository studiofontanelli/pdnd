package it.csi.staris.pdnd;

import it.csi.staris.pdnd.util.EncryptUtil;
import it.csi.staris.pdnd.util.Tracer;
import junit.framework.TestCase;

public class CalcolaCheckDigitTestCase extends TestCase {



	public void testCalcolaCheckDigit() {

		String method = "testCalcolaCheckDigit";
		
		Tracer.write(getClass().getName(), method, "BEGIN");
		try{
			
			EncryptUtil  encryptUtil = new EncryptUtil();
			
			
			String idDocumento = "1325";
			
			idDocumento = "1058";
			idDocumento = "273";
			
			
			
			String key = "Mulligan";
			
			
			//String checkDigit = encryptUtil.getCheckDigit(idDocumento, key);
			String checkDigit = encryptUtil.getCheckDigit(idDocumento);
			
			encryptUtil.getCheckDigit(idDocumento);
			
			Tracer.write(getClass().getName(), method, "idDocumento = " + idDocumento);
			Tracer.write(getClass().getName(), method, "checkDigit  = " + checkDigit);
			
		}
		catch(Exception e){
			Tracer.write(getClass().getName(), method, "Exception: " + e);
		}
		finally{
			Tracer.write(getClass().getName(), method, "END");
		}
	}

}
