package CRUDOperationUsingTDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostFoodOrderRequest2Test {

	
	@Test
	public void postRequest2Test()
	{
		
	 
	/*JSONObject obj=new JSONObject();
	//obj.put("food_order_id",2);
	obj.put("date_time", "2022-11-05 10:36:38.933254");
	obj.put("total_cost",4936);
	obj.put("id",5);
	//obj.put("name","Brijesh25");
	obj.put("status","Done412");*/
		baseURI="http://localhost:8080";
		
		//File object=new File("C:\\Users\\brije\\OneDrive\\Desktop\\data.json");

		JSONObject main=new JSONObject();
		main.putIfAbsent("dateTime","2022-11-04T11:41:24.815Z");
		main.put("id", 8);
		
		
		JSONArray aItems=new JSONArray();
		
		JSONObject items=new JSONObject();
		items.put("category", "Dinner");
		items.put("Dinner", 2500);
		items.put("id", 9);
		items.put("name","seafood");
		items.put("quantity", 5);
		
		
		aItems.add(items);
		
		main.put("items", aItems);
		main.put("status", "notdelivered");
		main.put( "totalCost",10000);
		
	
	given()
	.contentType(ContentType.JSON)
	.body(main)
	
	.when()
	.post("/foodorders")
	.then()
	.assertThat().statusCode(201)
	.log().all();	
	}
	
}
