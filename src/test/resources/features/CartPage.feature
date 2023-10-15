@B7SFRM-154
Feature: Cart Page Funktion

  @B7SFRM-200
  Scenario: As a user I can verify that the price, quantity and total cost details of the product added to the cart are visible.
    Given The user is on the Home Page
    When Find and click the product named "Dut Pekmezi"
    When I can click "Sepete Ekle" and "Sepeti görüntele" button
    Then Verify that the price, quantity and total cost details of the product added to the cart are visible.

  @B7SFRM-201
  Scenario: As a user I can verify that the product added to the cart has been removed from the cart.
    Given The user is on the Home Page
    When Find and click the product named "Dut Pekmezi"
    When I can click "Sepete Ekle" and "Sepeti görüntele" button
    When Remove product from cart.
    Then Verify that the product added to the cart has been removed from the cart.

  @B7SFRM-205
  Scenario: As a user I can verify that the calculation of the order summary on the Your Cart page.
    Given The user is on the Home Page
    When Click the product named Dut Pekmezi and Kabuklu Ceviz click Sepete Ekle button
    Then Verify that the calculation of the order summary on the Your Cart page.

    @B7SFRM-206
    Scenario: As a user I can verify that you can access the previous page with the "Alışverişe Devam Et" button on your cart page.
      Given The user is on the Home Page
      When Find and click the product named "Dut Pekmezi"
      When I can click "Sepete Ekle" and "Sepeti görüntele" button
      When Click on the Alisverise Devam Et button
      Then Verify that you can access the previous page with the "Alışverişe Devam Et" button on your cart page.
