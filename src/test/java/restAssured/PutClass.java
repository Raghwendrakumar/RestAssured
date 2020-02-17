package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutClass {
	
	@Test
	public void putMethod() {
		RestAssured.baseURI = "https://reqres.in";
		
		Response response = given()
				.header("Content-Type","application/json")
				.and()
				.body("{" + 
						"\"name\": \"morpheus\"," + 
						"\"job\": \"zion resident\"" + 
						"}")
				.when()
					.put("/api/users/2")
				.then()
					.statusCode(200)
					.log().all()
					.extract().response();
	}

}
