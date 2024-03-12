package it.csi.staris.pdnd;

import java.io.File;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.DateFormat;
import it.csi.staris.pdnd.util.EncryptUtil;
import it.csi.staris.pdnd.util.Tracer;
import junit.framework.TestCase;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;

public class DownloadFileTestCase extends TestCase {



	public void testDownloadFile() {

		String method = "testDownloadFile";

		Tracer.write(getClass().getName(), method, "BEGIN");
		try{
			Tracer.write(getClass().getName(), method, "download file");


			Tracer.write(getClass().getName(), method, "java.io.tmpdir= " + System.getProperty("java.io.tmpdir"));

			String idDocumento = "286904";

			String key = "Mulligan";
			//String key = "badKey";

			Tracer.write(getClass().getName(), method, "key= " + key);

			String resource = "http://127.0.0.1/pdnd/checkDigit/download/downloadfile";
			resource = "http://tst-applogic.reteunitaria.piemonte.it/pdnd/checkDigit/download/downloadfile";
			//resource = "http://dev-jboss43cp09-044.self.csi.it:15410/pdnd/checkDigit/download/downloadfile";
			//http://dev-jboss43cp09-044.self.csi.it:15410
			EncryptUtil  encryptUtil = new EncryptUtil();

			String checkDigit = encryptUtil.getCheckDigit(idDocumento, key);

			Tracer.write(getClass().getName(), method, "checkDigit= " + checkDigit);


			GetMethod get = new GetMethod(resource.toString());

			NameValuePair[] params = {
					new NameValuePair("codiceFruitore", "RISCF_B"),
					new NameValuePair("idDocumento", idDocumento),
					new NameValuePair("checkDigit", checkDigit)
			};



			//Header header = new Header(Constants.AUTH_ID_MARKER, identita);

			get.setQueryString(params);
			//get.setRequestHeader(header);


			HttpClient client = new HttpClient();
			int status = client.executeMethod(get);

			Tracer.write(getClass().getName(), method, "status= " + status);







		}
		catch(Exception e){
			Tracer.write(getClass().getName(), method, "Exception: " + e);
		}
		finally{
			Tracer.write(getClass().getName(), method, "END");
		}
	}



	public void testDownloadEsercizioFile() {

		String method = "testDownloadEsercizioFile";

		Tracer.write(getClass().getName(), method, "BEGIN");
		try{
			Tracer.write(getClass().getName(), method, "download file");


			Tracer.write(getClass().getName(), method, "java.io.tmpdir= " + System.getProperty("java.io.tmpdir"));

			String idDocumento = "6860";

			String key = "Mulligan";

			Tracer.write(getClass().getName(), method, "key= " + key);

			//String resource = "http://127.0.0.1/pdnd/checkDigit/download/downloadfile";
			String resource = "http://applogic.reteunitaria.piemonte.it/pdnd/checkDigit/download/downloadfile";
			//String resource = "http://dev-applogic.reteunitaria.piemonte.it/pdnd/checkDigit/download/downloadfile";
			//http://dev-jboss43cp09-044.self.csi.it:15410
			EncryptUtil  encryptUtil = new EncryptUtil();

			String checkDigit = encryptUtil.getCheckDigit(idDocumento, key);

			Tracer.write(getClass().getName(), method, "checkDigit= " + checkDigit);


			GetMethod get = new GetMethod(resource.toString());

			NameValuePair[] params = {
					new NameValuePair("codiceFruitore", "RISCF_B"),
					new NameValuePair("idDocumento", idDocumento),
					new NameValuePair("checkDigit", checkDigit)
			};



			//Header header = new Header(Constants.AUTH_ID_MARKER, identita);

			get.setQueryString(params);
			//get.setRequestHeader(header);


			HttpClient client = new HttpClient();
			int status = client.executeMethod(get);

			Tracer.write(getClass().getName(), method, "status= " + status);







		}
		catch(Exception e){
			Tracer.write(getClass().getName(), method, "Exception: " + e);
		}
		finally{
			Tracer.write(getClass().getName(), method, "END");
		}
	}

	public void testResource() {
		String method = "testResource";

		Tracer.write(getClass().getName(), method, "BEGIN");
		try{

			String resource = "http://127.0.0.1/pdnd/testResource";

			GetMethod get = new GetMethod(resource.toString());

			HttpClient client = new HttpClient();
			int status = client.executeMethod(get);

			Tracer.write(getClass().getName(), method, "status= " + status);

		}
		catch(Exception e){
			Tracer.write(getClass().getName(), method, "Exception: " + e);
		}
		finally{
			Tracer.write(getClass().getName(), method, "END");
		}
	}

}
