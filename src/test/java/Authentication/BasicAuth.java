package Authentication;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;


@Test
public class BasicAuth {
	public void bearerToken()
	{
		baseURI="https://github.com/";
		
		
		given().auth().basic("Brijesh-Pradhan","crjunior98")
		.when().get("/login")
		.then().log().all();
		
		
	}
}
