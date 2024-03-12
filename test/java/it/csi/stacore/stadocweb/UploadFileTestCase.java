package it.csi.staris.pdnd;

import java.io.File;

import it.csi.staris.pdnd.util.Tracer;
import junit.framework.TestCase;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class UploadFileTestCase extends TestCase {



	public void testUploadFile() {

		String method = "testUploadFile";
		
		Tracer.write(getClass().getName(), method, "BEGIN");
		try{
			Tracer.write(getClass().getName(), method, "upload file");
			
			
			Tracer.write(getClass().getName(), method, "java.io.tmpdir= " + System.getProperty("java.io.tmpdir"));
			
			String resource = "http://dev-applogic.reteunitaria.piemonte.it/pdnd/upload/uploadfile";
			//String resource = "http://127.0.0.1/pdnd/upload/uploadfile";
			
			
			
			
			//http://dev-jboss43cp09-044.self.csi.it:15410/pdnd/auth/upload/uploadfile
			//http://127.0.0.1/pdnd/auth/upload/uploadfile
			
			PostMethod post = new PostMethod(resource.toString());
			////String resource = "http://tst-wls9-01.csi.it:9156/mudesrvextsicApplDocumentale/estraiFileIstanza?token=" + token + "&numeroIstanza="+numeroIstanzaMude;

			String filePath = "/opt/java/file.xml";
			//String filePath = "/opt/share/filmati/DSC_0057.AVI";
			
			File allegato = new File(filePath);
			
			
			
			
			//Apress.Beginning.PhoneGap.Feb.2012
			/*
			 * Metadati md = new Metadati();
		md.setCodiceFiscale("WAWAWIWOWA");
		md.setIdEntitaFruitore("WGLIUNNI");
		md.setTarga("BB555CC");
		request.setMetadati(md);
			 * 
			 * 
			Part[] parts = {
					new StringPart("token", token),
					new StringPart("comune", codiceIstatTorino),
					new StringPart("numeroPratica", riferimentoPraticaEdilizia),
					new StringPart("anno", anno),
					new StringPart("tipoDocumento", tipoDocumento),
					new FilePart(allegato.getName(), allegato)
			};
			*/
			Part[] parts = {
					new StringPart("codiceFruitore", "GOSS"),
					new StringPart("folder", "HTTPJUNIT"),
					new StringPart("tipoDocumento", "GOSS_ALL"),
					new StringPart("codiceFiscale", "CCCCCC"),
					new StringPart("idEntitaFruitore", RandomStringUtils.random(8)),
					new StringPart("targa", "DD777DJ"),
					new FilePart(allegato.getName(), allegato)
					
					
			};
			
			post.setRequestEntity(new MultipartRequestEntity(parts, post.getParams()));
			
			
			HttpClient client = new HttpClient();
			int status = client.executeMethod(post);
			
			
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
