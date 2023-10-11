@B7SFRM-155
Feature:Categories-User Can Select Shopping Subcategory

  Background: Navigate to Sofram website.
    Given The user is on the Home Page

  @B7SFRM-191
  Scenario Outline:The non-registered user should be able to navigate the Sub-Category Page.
    When The user clicks on the "<Subcategory>" icon
    Then Verify that the non-registered user should be able to navigate the "<subcategories>" Page.
    Examples:
      | Subcategory                           | subcategories               |
      | Nüsse                                 | Nüsse                       |
      | Frühstücksartikel                     | Frühstück                   |
      | Türkischer Leckerbissen und Pestilenz | Türkische Freude und Gebäck |
      | Bäckereiprodukte und Desserts         | Bäckereien und Desserts     |
      | Spezielle Öle und Saucen              | Spezielle Öle und Saucen    |
      | Nährmittel                            | Nährmittel                  |

  @B7SFRM-194
  Scenario Outline:The registered user should be able to navigate the Sub-Category Page.
    When The user clicks to Sing In
    When The user enters correct "email" , "password" and clicks black login button
    When The user clicks on the "<Subcategory>" icon
    Then Verify that the non-registered user should be able to navigate the "<subcategories>" Page.
    Examples:
      | Subcategory                           | subcategories               |
      | Nüsse                                 | Nüsse                       |
      | Frühstücksartikel                     | Frühstück                   |
      | Türkischer Leckerbissen und Pestilenz | Türkische Freude und Gebäck |
      | Bäckereiprodukte und Desserts         | Bäckereien und Desserts     |
      | Spezielle Öle und Saucen              | Spezielle Öle und Saucen    |
      | Nährmittel                            | Nährmittel                  |

  @B7SFRM-195
  Scenario Outline:The "Daha fazlasını oku" button in the category  description on the subcategory page should  be able to active.
    When The user clicks on the "<Subcategory>" icon
    And The user clicks on the weiterlesen button.
    Then Verify that the Weiterlesen button is active.
    When The user clicks on the Lese weniger button.
    Then Verify that the Lese weniger button is active.
    Examples:
      | Subcategory                           |
      | Nüsse                                 |
      | Frühstücksartikel                     |
      | Türkischer Leckerbissen und Pestilenz |
      | Bäckereiprodukte und Desserts         |
      | Spezielle Öle und Saucen              |
     | Nährmittel                            |


