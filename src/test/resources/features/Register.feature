@B7SFRM-146
Feature: The User-Register Functionality
  Background: Navigate to Sofram website.
    Given The user is on the Home Page

  @B7SFRM-163
  Scenario: Access to the Register page Test
    When The user clicks on the Register
    Then Verify access to the Register page.

  @B7SFRM-166
  Scenario: The user enters valid value
    When The user clicks on the Register
    When The user enters valid firstName, lastName, email, password and clicks account button
    Then Verify that the user can create a user account.

  @B7SFRM-186
  Scenario Outline: The user enters invalid value
    When The user clicks on the Register
    When The user enters valid "<firstName>" and "<lastName>" and "<email>" , "<password>" and clicks account button
    Then Verify the warning message '<expectedMessage>'
    Examples:
      | firstName | lastName | email                | password | expectedMessage                                                                                           |
      | Alex      | Muller   | alexmuller           | 12345    | Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "alexmuller" fehlt ein @-Zeichen.          |
      | Alex      | Muller   | alexmullergmail.com  | 12345    | Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "alexmullergmail.com" fehlt ein @-Zeichen. |
      | Alex      | Muller   | alexmuller@          | 12345    | Gib etwas nach dem @-Zeichen ein. Die Angabe „alexmuller@“ ist unvollständig.                             |
      | Alex      | Muller   | alexmuller@gmail     | 12345    | E-mail ist ungültig                                                                                       |
      | Alex      | Muller   | alexmuller@gmail.    | 12345    | Das Punktzeichen "." steht in "gmail." an einer falschen Stelle.                                          |
      | Alex      | Muller   | alexmuller@gmail.com | 1234     | Passwort ist zu kurz (Untergrenze sind 5 Zeichen)                                                         |
      | Alex      | Muller   |                      |          | Fülle dieses Feld aus.                                                                                    |
      | Alex      | Muller   |                      | 12345    | Fülle dieses Feld aus.                                                                                    |

  @B7SFRM-187
  Scenario Outline: The user leaves the password entry blank
    When The user clicks on the Register
    When The user enters valid "<firstName>" and "<lastName>" and "<email>" , "<password>" and clicks account button
    Then Verify the warning message "<expectedMessage>" for password
    Examples:
      | firstName | lastName | email                | password | expectedMessage        |
      | Alex      | Muller   | alexmuller@gmail.com |          | Fülle dieses Feld aus. |


