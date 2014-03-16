package monterey_housing.ideasofmarch2014team6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class DataPull {

	private String URL = "http://secure.loosescre.ws/~keith/hamonterey.org/Mserver.php?command=getCity&City=Salinas";
	
	public DataPull(){
		   HttpClient httpclient = new DefaultHttpClient();

		    HttpResponse response;
			try {
				response = httpclient.execute(new HttpGet(URL));
				   StatusLine statusLine = response.getStatusLine();
				    if(statusLine.getStatusCode() == HttpStatus.SC_OK){
				        ByteArrayOutputStream out = new ByteArrayOutputStream();
				        response.getEntity().writeTo(out);
				        out.close();
				        String responseString = out.toString();
				        System.out.println(responseString);
				        //..more logic
				    } else{
				        //Closes the connection.
				        response.getEntity().getContent().close();
				        throw new IOException(statusLine.getReasonPhrase());
				    }
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
}
