package StepDefination1;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSteps {
	Response res;
	ValidatableResponse validate;
	@When("User want to fetch the data from database {string}")
	public void user_want_to_fetch_the_data_from_database(String URI) {
	     res = RestAssured.get(URI);
	}

	@Then("User want to to verify status code {int}")
	public void user_want_to_to_verify_status_code(Integer code) {
	    validate = res.then();
	    validate.assertThat().statusCode(code).log().all();
	   }
	
	
	}

	
	


