@B7SFRM-148
Feature: Logout

  Background:
    Given The user is on the Home Page
    When The user clicks to Sing In
    When The user enters correct "<email>" , "<password>" and clicks black login button
    Then The user should be able to login sofram website

  @B7SFRM-181
  Scenario: Logout Test- As a user, I should be able to log out  the session safely.
    When The user clicks to Ausloggen
    Then Verify that the user should be able to log out on the Home Page















