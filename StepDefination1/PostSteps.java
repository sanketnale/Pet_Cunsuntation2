package StepDefination1;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostSteps {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;

	
	@Given("User want to post Data into database")
	public void user_want_to_post_data_into_database() {
		JSONObject obj=new JSONObject();
		obj.put("cost", 2600);
		obj.put("description", "tata");
		obj.put("id",31);
		obj.put("name", "rice");
		
		req= RestAssured.given()
				.body(obj)
		        .contentType(ContentType.JSON);
	}

	@When("User is able to put data into URI {string}")
	public void user_is_able_to_put_data_into_uri(String URI) {
		
	   res = req.post(URI);
	}

	@Then("User want to to validate status line {string}")
	public void user_want_to_to_validate_status_line(String string) {
	    validate =res.then();
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer code) {
	    validate.assertThat().statusCode(code)
	    .log().all();
	}
	
	
	
	
	}


