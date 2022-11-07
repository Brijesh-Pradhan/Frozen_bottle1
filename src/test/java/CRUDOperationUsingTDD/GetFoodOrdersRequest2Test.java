package CRUDOperationUsingTDD;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class GetFoodOrdersRequest2Test {
	@Test
	public void getRequestTest()
	{		
		baseURI = "http://localhost:8080";	
		given().contentType(ContentType.JSON)
		.when()
		.get("/foodorders?id=8")
		.then()
		.assertThat().contentType("application/xml")
		.statusCode(200)
	    .log().all();
	}
}
