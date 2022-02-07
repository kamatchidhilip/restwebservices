package apitestingpackage;

import java.net.http.HttpResponse;

import org.apache.http.protocol.HTTP;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirestexample {
	
	
	
	  public void getrequest() throws UnirestException {
	  
	  com.mashape.unirest.http.HttpResponse<JsonNode> json =
	  Unirest.get("https://gorest.co.in/public/v1/users").asJson();
	  
	  System.out.println("Status code :"+ json.getStatus());
	  System.out.println("Status messagec:" +json.getStatusText());
	  System.out.println("Response body :" + json.getBody());
	  }
	  
		public void postrequest() throws UnirestException {
			com.mashape.unirest.http.HttpResponse<JsonNode>	json  =  Unirest.post( "http://dummy.restapiexample.com/api/v1/create")
					.body("{\"name\":\"aatreaya\",\"salary\":\"12345\",\"age\":\"5\"}").asJson();
			
			  System.out.println("Status code :"+ json.getStatus());
			  System.out.println("Status messagec:" +json.getStatusText());
			  System.out.println("Response body :" + json.getBody());
			  }
		
	  //same for put and delete(change the url and response type)
	  
	  public static void main(String[] args) throws UnirestException {
	  Unirestexample example = new Unirestexample(); 
	 // example.getrequest(); 
	  example.postrequest();
	  }
	 	
	
	
}
