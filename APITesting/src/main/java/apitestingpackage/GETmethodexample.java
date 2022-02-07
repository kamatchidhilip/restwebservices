package apitestingpackage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GETmethodexample {

	public void GEtmethod() throws IOException {
		
		URL url = new URL("https://gorest.co.in/public/v1/users");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int response = connection.getResponseCode();
		System.out.println("response code is :" +response);
		String responmsg = connection.getResponseMessage();
		System.out.println("status message is:" +responmsg);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader buffered = new BufferedReader(inputstreamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		 while ((line=buffered.readLine())!=null) {
			buffer.append(line);
		}  
		System.out.println(buffer);
	}
public static void main(String[] args) throws IOException {
	GETmethodexample example = new GETmethodexample();
	example.GEtmethod();
	
}
}
