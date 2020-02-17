package restAssured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostClass {
	
	@Test
	public void postMethod() {
		JSONObject json = new JSONObject();
		json.put("name", "Tom");
		json.put("job", "Manager");
		
		RestAssured.baseURI = "https://reqres.in";
		
		given()
				.header("Content-Type","application/json")
				.body(json.toString())
		.when()
		.post("/api/users")
		.then()
		.statusCode(201)
		.and()
		.log().all();
		
	}

}
