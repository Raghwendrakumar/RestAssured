package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GetClass {
	
	@Test
	public void getMethod() {
		RestAssured.baseURI = "http://localhost:3030";
		
		given().contentType("application/json")
		.when().get("/products?$limit=10")
		.then().log().all();
		
	}

}
