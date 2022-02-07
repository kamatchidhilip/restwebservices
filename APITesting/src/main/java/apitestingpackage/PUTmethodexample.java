package apitestingpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PUTmethodexample {

	public void PUTexample() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/8706");
		HttpURLConnection connection =	(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.addRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"kama\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] inputjson = 	jsonBody.getBytes();

		OutputStream output =	connection.getOutputStream();
		output.write(inputjson);

		System.out.println("Response code :" +connection.getResponseCode());
		System.out.println("Response message :" +connection.getResponseMessage());

		InputStream inputstream = 	connection.getInputStream();
		InputStreamReader inputsteamreader = new InputStreamReader(inputstream);
		BufferedReader buffered = new BufferedReader(inputsteamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = buffered.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PUTmethodexample example = new PUTmethodexample();
		example.PUTexample();
	}

}
