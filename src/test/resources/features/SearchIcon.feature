@B7SFRM-149
  Feature: Search Icon function


    Scenario: As a user, I can verify that the product is displayed when the user searches for the item on the website
     Given The user is on the Home Page
      When Click on the "search button"
      When Enter "Antep Fıstığı" in the search box and click the search button
      Then Verify whether the search result is correct