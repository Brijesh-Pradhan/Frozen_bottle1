package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class BearerToken {

	
	
	@Test
	public void bearerToken()
	{
		
		baseURI="https://github.com/";
		
		JSONObject obj=new JSONObject();
		obj.put("name","FrozenBottleFood");
		given().auth().oauth2("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")
		.when().post("/users/repos")
		.then().log().all();
	}
}
