package CRUDOperationUsingTDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteFoodOrderRequest2Test {
	@Test
     public void deleteRequestTest()
     {
    	 
    	 baseURI="http://localhost:8080";
    	 /*given()
    	 .queryParam("id",14)
    	 .log().all().*/
    	 given()
 		.contentType(ContentType.JSON)
 		
    	 .when()
 		.delete("/foodorders/12")
 		.then()
 		.assertThat().contentType("application/xml")
 		.statusCode(200)
 		.log().all();
     }
}
