package venkatesh;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ResponseData2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("C:/Users/Training/eclipse-workspace/venkatesh/src/main/java/venkatesh/cars.json");
        Object obj = jsonParser.parse(reader);
        JSONArray cars = (JSONArray) obj;
        
       // cars.forEach( car -> metadata( (JSONObject) car, "make" ) );
        cars.forEach( car -> perdayrent( (JSONObject) car ) );
	}
	private static String metadata(JSONObject car, String s) 
	{
		JSONObject carObject = (JSONObject) car.get("metadata");
		if(s.equals("make")) {
		String make = (String) carObject.get("make");	
		System.out.println(make);
		return make;
		}
		else if(s.equals("vin")){
		String vin = (String) carObject.get("vin");	
		System.out.println(vin);
		return vin;
		}
		else if(s.equals("colour")){
		String colour = (String) carObject.get("colour");	
		System.out.println(colour);
		return colour;
		}
		else if(s.equals("model")){
		String model = (String) carObject.get("model");	
		System.out.println(model);
		return model;
		}
		else if(s.equals("Notes")){
		String Notes = (String) carObject.get("Notes");	
		System.out.println(Notes);
		return Notes;
		}
		return s;
		}
	private static void perdayrent(JSONObject car) 
	{
		JSONObject carObject = (JSONObject) car.get("perdayrent");
		
		Long Price = (Long) carObject.get("Price");	
		System.out.println(Price);
		
		Long Discount = (Long) carObject.get("Discount");	
		System.out.println(Discount);
		
		

	}
}
