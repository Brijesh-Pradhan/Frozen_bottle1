package CRUDOperationUsingTDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;


public class PostAdminRequestTest {

	@Test
	public void postRequestTest()
	{
				
				baseURI="http://localhost:8080";
				//File object=new File("C:\\Users\\brije\\OneDrive\\Desktop\\data2.json");
				JSONObject object=new JSONObject();
				object.put("email","brijeshpradhan3498@gmail.com");
				object.put("name", "BrijeshPradhan7865");
				object.put("password","coldjunior0707");
				object.put("id",999);
				
				given()
				.contentType(ContentType.JSON)
				.body(object)
				.when()
				.post("/admin")
				.then()
				.assertThat().statusCode(201)
				.log().all();
	}
}
