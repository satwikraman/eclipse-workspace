package venkatesh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ResponseData {
	public static JSONObject cars() throws FileNotFoundException, IOException, ParseException {
	Object obj = new JSONParser().parse(new FileReader("C:/Users/Training/eclipse-workspace/venkatesh/src/main/java/venkatesh/cars.json")); 
	JSONObject jo = (JSONObject) obj;
   return jo;
	}

	public static LinkedHashMap<String, String> car1() throws JSONException, FileNotFoundException, IOException, ParseException {
		LinkedHashMap<String, String> c11=new LinkedHashMap<String,String>();
		LinkedHashMap<String, Integer> c12=new LinkedHashMap<String,Integer>();
		c11.put("car1",  cars().get("car1").toString());
		 return  c11;
		
	}
	public static void car2(){
		LinkedHashMap<String, String> c21=new LinkedHashMap<String,String>();
		LinkedHashMap<String, Integer> c22=new LinkedHashMap<String,Integer>();
	}
	public static void car3(){
		LinkedHashMap<String, String> c31=new LinkedHashMap<String,String>();
		LinkedHashMap<String, Integer> c32=new LinkedHashMap<String,Integer>();
	}
	public static void car4(){
		LinkedHashMap<String, String> c41=new LinkedHashMap<String,String>();
		LinkedHashMap<String, Integer> c42=new LinkedHashMap<String,Integer>();
	}
	public static void car5(){
		LinkedHashMap<String, String> c51=new LinkedHashMap<String,String>();
		LinkedHashMap<String, Integer> c52=new LinkedHashMap<String,Integer>();
	}
	public static void car6(){
		LinkedHashMap<String, String> c61=new LinkedHashMap<String,String>();
		LinkedHashMap<String, Integer> c62=new LinkedHashMap<String,Integer>();
	}
public static void main(String[]args) throws FileNotFoundException, RuntimeException, IOException, ParseException {
	System.out.println(car1().get("car1"));
}
}
