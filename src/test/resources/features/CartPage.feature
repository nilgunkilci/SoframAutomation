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