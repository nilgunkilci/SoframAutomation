@B7SFRM-150
Feature: As a user I should be able to see products details

@B7SFRM-185
Scenario: As a user, I can verify that the price, quantity and total cost details of the product added to the cart are visible.
Given The user is on the Home Page
When User can click the "Yemeklikler" and the "Hatay Ev Yapımı Domates Salçası"
Then Verify that product details is visible: product name, category, price, availability, condition, brand

@B7SFRM-188
Scenario: As a user, I can verify that the price increases in line with the number of products
Given The user is on the Home Page
When User can click the "Yemeklikler" and the "Hatay Ev Yapımı Domates Salçası"
When Increase the quantity of the product to 5
Then Verify if the product quantity and price match