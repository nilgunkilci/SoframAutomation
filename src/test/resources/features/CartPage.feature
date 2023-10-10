Feature: Cart Page Funktion
  @B7SFRM-185
  Scenario: As a user, I can verify that the price, quantity and total cost details of the product added to the cart are visible.
    Given The user is on the Home Page
    When User can click the "Yemeklikler" and the "Hatay Ev Yapımı Domates Salçası"
    Then Verify that product details is visible: product name, category, price, availability, condition, brand