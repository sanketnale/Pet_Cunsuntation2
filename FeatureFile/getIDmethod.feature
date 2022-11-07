Feature: user is able fetch the data by id



@GetByid
Scenario: User want to read data from database
When User want to fetch the data from database "http://localhost:8080/products/33"
Then User want to to verify status code 200


