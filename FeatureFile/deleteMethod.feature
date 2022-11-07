Feature: User is able delete the data 

@DeleteByID
Scenario: User want to delete the product by id from database
When user is able to delete the product with id by using an api "http://localhost:8080/products/24"
Then User validate the delete product status code by id is 404