package CRUDOperationUsingTDD;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
public class GetAdminRequestTest {	
	@Test
	public void getRequestTest()
	{
		baseURI="http://localhost:8080";
		given().contentType(ContentType.JSON)
		 
		.when()
		.get("/admin/62")
		.then()
		.assertThat().contentType("application/xml")
		.statusCode(200)
	    .log().all();
	}
}
 