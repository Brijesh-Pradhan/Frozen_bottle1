package CRUDOperationUsingTDD;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class DeleteAdminRequestTest {
    @Test
	public void deleteRequestTest()
	{
		baseURI = "http://localhost:8080";
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.delete("/admin/57")
		
		.then()
		.assertThat().contentType("application/xml")
		.statusCode(200)
		.log().all();
	}
	
}
