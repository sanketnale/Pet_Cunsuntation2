package StepDefination1;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetWithIdSteps
{
	Response res;
	ValidatableResponse validate;
	
	@When("User want to retrive  the data from database by using URI {string}")
	public void user_want_to_retrive_the_data_from_database_by_using_uri(String URI) 
	{
		 res = RestAssured.get(URI);
  	}

	@Then("User want to validate the code is  {int}")
	public void user_want_to_validate_the_code_is(Integer code)
	{
		  validate = res.then();
		    validate.assertThat().statusCode(code).log().all();
	}
}
