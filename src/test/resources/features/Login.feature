@B7SFRM-147
Feature: Login Sofram on Homepage

  Background:
    Given The user is on the Home Page
    When The user clicks to Sing In

  @B7SFRM-168
  Scenario Outline: Positive Login Test
    When The user enters correct "<email>" , "<password>" and clicks black login button
    Then The user should be able to login sofram website
    Examples:
      | email            | password |
      | sofram@gmail.com | 12345    |

  @B7SFRM-172
  Scenario Outline: Negative Login Test
    When The user enters missing or blank "<email>" , right "<password>" and clicks black login button
    Then The user should NOT be able to login and see the warning message '<EmailMessage>'
    Examples:
      | email           | password | EmailMessage                                                                                          |
      |                 | 12345    | Fülle dieses Feld aus.                                                                                |
      | soframgmail.com | 12345    | Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "soframgmail.com" fehlt ein @-Zeichen. |
      | sofram@         | 12345    | Gib etwas nach dem @-Zeichen ein. Die Angabe „sofram@“ ist unvollständig.                             |
      | sofram@.com     | 12345    | Das Punktzeichen "." steht in ".com" an einer falschen Stelle.                                        |
      |                 |          | Fülle dieses Feld aus.                                                                                |

  @B7SFRM-174
  Scenario Outline: Negative Login Test
    When The user enters right "<email>" , blank or missing "<password>" and clicks black login button
    Then The user should NOT be able to login and see the warning Passwordmessage "<PasswordMessage>"
    Examples:
      | email            | password | PasswordMessage        |
      | sofram@gmail.com |          | Fülle dieses Feld aus. |

  @B7SFRM-176
  Scenario Outline: Negative Login Test
    When The user enters wrong "<email>" or wrong "<password>" and clicks black login button
    Then The user should be able to AnmeldungPage and see the warning message "<Message>"
    Examples:
      | email                    | password | Message                                          |
      | wiegehtesdir06@gmail.com | 12345    | Die E-Mail-Adresse oder das Passwort ist falsch. |
      | sofram@gmail.com         | abcde    | Die E-Mail-Adresse oder das Passwort ist falsch. |
