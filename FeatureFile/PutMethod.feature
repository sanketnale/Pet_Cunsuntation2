Feature: Put Request


@PutByID
Scenario: User should be able to update data into database
Given User want to update the Data into database
When User is able to update  data into the database using URI "http://localhost:8080/products"
Then User Want to Check the code is 201
 