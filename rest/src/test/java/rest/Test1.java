package rest;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testStatuscode() {
		given().
		get("http://jsonplaceholder.typicode.com/posts/3").
		then().
		statusCode(200);
	}

	@Test
	public void testLogging() {
		given().
		get("http://services.groupkt.com/country/get/iso2code/in").
		then().statusCode(200).
		log().all();
	}
	
}
