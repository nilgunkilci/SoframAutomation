@B7SFRM-153
Feature: Adding and Removing Products to The Cart

  Background: Navigate to Sofram website.
    Given The user is on the Home Page

  @B7SFRM-208
  Scenario: The user should be able to return to the same page with the "Alışverişe Devam Et" button in the shopping cart opened in the side window.
    When The user adds products to the cart from the home page.
    And The user clicks the (Alışverişe Devam Et) button in the shopping cart opened in the side window.
    Then Verify that the user can return to the home page.

  @B7SFRM-211
  Scenario Outline: The user should be able to see the product in the shopping cart that opens in the side window, when the user adds products to the cart from the products in the subcategory.
    When The user clicks on the "<Subcategory>" icon
    And The user adds  product from "<Subcategory>".
    Then Verify that the "<Number of products>" in your cart section in the pop-up side window.
    Examples:
      | Subcategory                           | Number of products |
      | Nüsse                                 | 1                  |
      | Frühstücksartikel                     | 1                  |
      | Türkischer Leckerbissen und Pestilenz | 1                  |
      | Bäckereiprodukte und Desserts         | 1                  |
      | Spezielle Öle und Saucen              | 1                  |
      | Nährmittel                            | 1                  |

  @B7SFRM-212
  Scenario Outline: The user should be able to see the free shipping offer is active ,by adding the products to the cart from the subcategory.
    When The user clicks on the "<Subcategory>" icon
    And The user adds  product from "<Subcategory>".
    Then Verify that  the free shipping offer in your cart section in the pop-up side window.
    Examples:
      | Subcategory                           |
      | Nüsse                                 |
      | Frühstücksartikel                     |
      | Türkischer Leckerbissen und Pestilenz |
      | Bäckereiprodukte und Desserts         |
      | Spezielle Öle und Saucen              |
      | Nährmittel                            |

  @B7SFRM-213
  Scenario Outline: The user should be able to close the "Alışveriş Sepeti" page that opens as a side window can be closed with the "X" icon.
    When The user clicks on the "<Subcategory>" icon
    And The user adds  product from "<Subcategory>".
    Then Verify that the Shopping Cart page can be closed with the X icon.
    Examples:
      | Subcategory                           |
      | Nüsse                                 |
      | Frühstücksartikel                     |
      | Türkischer Leckerbissen und Pestilenz |
      | Bäckereiprodukte und Desserts         |
      | Spezielle Öle und Saucen              |
      | Nährmittel                            |

  @B7SFRM-214
  Scenario Outline: The user should be able to navigate to the payment page from the "Alışveriş Sepeti" page that opens as a side window.
    When The user clicks on the "<Subcategory>" icon
    And The user adds  product from "<Subcategory>".
    And The user clicks on the kasse button
    Then Verify that navigate to the payment page from the cartpage that opens as a side window.
    Examples:
      | Subcategory                           |
      | Nüsse                                 |
      | Frühstücksartikel                     |
      | Türkischer Leckerbissen und Pestilenz |
      | Bäckereiprodukte und Desserts         |
      | Spezielle Öle und Saucen              |
      | Nährmittel                            |

  @B7SFRM-215
  Scenario Outline: The user should be able to navigate to the cart page from the "Alışveriş Sepeti" page that opens as a side window.
    When The user clicks on the "<Subcategory>" icon
    And The user adds  product from "<Subcategory>".
    And The user clicks on the cart button
    Then Verify that navigate to the cart page from the cartpage that opens as a side window.
    Examples:
      | Subcategory                           |
      | Nüsse                                 |
      | Frühstücksartikel                     |
      | Türkischer Leckerbissen und Pestilenz |
      | Bäckereiprodukte und Desserts         |
      | Spezielle Öle und Saucen              |
      | Nährmittel                            |
