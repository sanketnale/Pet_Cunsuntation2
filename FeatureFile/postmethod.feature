Feature: User is able to post the data in database

@PostMethod
Scenario: User should be able to add data into database
Given User want to post Data into database
When User is able to put data into URI "http://localhost:8080/products"
Then User want to to validate status line "HTTP/1.1 200"
And User want to validate status code 201 
