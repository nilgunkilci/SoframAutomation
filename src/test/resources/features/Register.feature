Feature: The User-Register Functionality
@wip
  Scenario Outline: Positive Register Functionality Test
    Given The user is on the Home Page
    When The user clicks on the Register
    When The user enters valid "<firstName>" and "<lastName>" and "<email>" , "<password>" and clicks account button
    Then Verify that the user can create a user account.
    Examples:
      | firstName | lastName | email                 | password |
      | Alex      | Muller   | alex_muller@gmail.com | 12345    |