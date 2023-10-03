@B7SFRM-147
Feature: Login Sofram on Homepage

  @B7SFRM-147
  Scenario Outline: Positive Login Test
    Given The user is on the Home Page
    When The user clicks to Sing In
    When The user enters correct "<email>" , <"password"> and clicks black login button
    Then The user should be able to login sofram website

    Examples:
      | email            | password |
      | sofram@gmail.com | 12345    |
