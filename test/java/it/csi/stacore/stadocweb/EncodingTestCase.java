package it.csi.staris.pdnd;

import it.csi.staris.pdnd.util.Tracer;
import junit.framework.TestCase;

public class EncodingTestCase extends TestCase {



	public void testEncodingUrl() {

		String method = "testEncodingUrl";
		String encoding = null;
		Tracer.write(getClass().getName(), method, "BEGIN");
		try{

			
			encoding = System.getProperty("sun.jnu.encoding");

			Tracer.write(getClass().getName(), method, "java.io.tmpdir= " + System.getProperty("java.io.tmpdir"));
			Tracer.write(getClass().getName(), method, "sun.jnu.encoding= " + encoding);

			String[] testStrings = {"All fall gala hall", 
			"this\\is/a�%test\t_~!@#$%^&*()dude"};
			/*
			for (String s : testStrings){
				String encodedString = URLEncoder.encode(s, "UTF-8");
				System.out.format("'%s'\n", encodedString);
			}
			*/
			for (String s : testStrings){
				//String encodedString = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(s);
				System.out.format("'%s'\n", org.apache.commons.codec.binary.StringUtils.getBytesUtf8(s).toString());
				System.out.println("s= " +  s.getBytes("UTF-8"));
				String valueUTF8 = new String(s.getBytes("UTF-8"), "UTF-8"); 
				String value = new String(s.getBytes("UTF-8"), encoding); 
				System.out.println("valueUTF8= " + valueUTF8);
				System.out.println("value [" + encoding + "]= " +  value);
			}

		}
		catch(Exception e){
			Tracer.write(getClass().getName(), method, "Exception: " + e);
		}
		finally{
			Tracer.write(getClass().getName(), method, "END");
		}
	}

}
