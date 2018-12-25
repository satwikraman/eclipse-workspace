package satwik;

import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Validations extends ResponseData {
	private static JSONObject car;
	@SuppressWarnings("rawtypes")
	private static ArrayList cars;
	public static void main(String[] args) throws Exception {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("C:/Users/Training/eclipse-workspace/Json/src/main/java/cars.json");
        Object obj = jsonParser.parse(reader);
        cars = (JSONArray) obj;
        System.out.println( Q1("Tesla","black"));  
        Q2("withoutDis");
	}
	
	public static int Q1(String make, String colour) {
		int count =0;
		for (int i = 0; i < cars.size(); i++) {
			car=(JSONObject) cars.get(i); 
			if((metadata(car, "make")).equals(make)) {
				if((metadata(car, "colour")).equals(colour)) {
					System.out.println(metadata(car, "make")+" "+metadata(car, "model"));
					System.out.println(metadata(car, "Notes"));
					System.out.println();
					count++;
				}
			}
		}
		return count;

	}
	public static void Q2(String s) {
		
		 
		if(s.equals("withDis")) {
			
			car=(JSONObject) cars.get(0);
			perdayrent(car,"Price");
			Long cost=perdayrent(car,"Price")-perdayrent(car,"Discount");;
			String low;
			low="";
			for (int i = 0; i < cars.size(); i++) {
				car=(JSONObject) cars.get(i); 
				if(cost>(perdayrent(car,"Price")-perdayrent(car,"Discount"))) {
					cost=(perdayrent(car,"Price")-perdayrent(car,"Discount"));
					low=metadata(car,"make")+ " "+metadata(car, "model")+" "+metadata(car, "colour");
				}
			}
			System.out.println(low);
			System.out.println(cost);
		}
		else if(s.equals("withoutDis")) {
			car=(JSONObject) cars.get(0);
			Long cost=perdayrent(car,"Price");
			String low="";
			for (int i = 0; i < cars.size(); i++) {
				car=(JSONObject) cars.get(i); 
				if(cost>(perdayrent(car,"Price"))){
					cost=(perdayrent(car,"Price"));
					low=metadata(car, "make")+ " "+metadata(car, "model")+" "+metadata(car, "colour");
				}
			}
			System.out.println(low);
			System.out.println(cost);
		}
	}


}
