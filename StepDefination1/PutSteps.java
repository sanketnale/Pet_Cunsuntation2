package StepDefination1;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutSteps {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	
	@Given("User want to update the Data into database")
	public void user_want_to_update_the_data_into_database() {
		JSONObject obj1=new JSONObject();
		obj1.put("cost",1500);
		obj1.put("description", "Pedigree");
		obj1.put("id",35);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
		obj1.put("name", "Bread");
		
		req= RestAssured.given()
				.body(obj1)
		        .contentType(ContentType.JSON);

	   
	}

	@When("User is able to update  data into the database using URI {string}")
	public void user_is_able_to_update_data_into_the_database_using_uri(String URI) {
		 res = req.post(URI);
	}

	@Then("User Want to Check the code is {int}")
	public void user_want_to_check_the_code_is(Integer code) {
		 validate =res.then();
		validate.assertThat().statusCode(code).log().all();
	}
	
	

}
