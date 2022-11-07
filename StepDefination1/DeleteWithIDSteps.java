package StepDefination1;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteWithIDSteps {
	Response res;
	ValidatableResponse validate;
	
	@When("user is able to delete the product with id by using an api {string}")
	public void user_is_able_to_delete_the_product_with_id_by_using_an_api(String URI) {
		res = RestAssured.get(URI);
	}

	@Then("User validate the delete product status code by id is {int}")
	public void user_validate_the_delete_product_status_code_by_id_is(Integer code) {
		    validate = res.then();
		    validate.assertThat().statusCode(code).log().all();
	}


}
