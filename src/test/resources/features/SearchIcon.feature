@B7SFRM-149
Feature: Search Icon function

  @B7SFRM-161
  Scenario: As a user, I can verify that the product is displayed when the user searches for the item on the website
    Given The user is on the Home Page
    When Click on the "search button"
    When Enter "Antep Fıstığı" in the search box and click the search button
    Then Verify whether the search result is correct

  @B7SFRM-162
  Scenario: As a user, I can verify that the message "product not found" is displayed when the user searches for the item that is not on the website
    Given The user is on the Home Page
    When Click on the "search button"
    When Enter Karpuz in the search box and click the search button
    Then Verify that the message "product not found" is displayed when the user searches for the item that is not on the website