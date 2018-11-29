import java.util.LinkedHashMap;

public class Collect {

	public static void main(String[] args) {
	LinkedHashMap<String, String> lhm1=new LinkedHashMap<String,String>();
	lhm1.put("make","tesla");
	lhm1.put("model","3");
	lhm1.put("vin", "09AGHY64352JITEG98K");
	System.out.println(lhm1.get("make"));
	}

}
