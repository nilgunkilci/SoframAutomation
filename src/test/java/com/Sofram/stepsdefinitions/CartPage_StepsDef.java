package com.Sofram.stepsdefinitions;

import com.Sofram.pages.CartPage;
import com.Sofram.pages.SearchIcon;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartPage_StepsDef {
    CartPage cartPage = new CartPage();
    SearchIcon searchIcon = new SearchIcon();
    int sayi = 0;

    @When("User can click the {string} and the {string}")
    public void user_can_click_the_and_the(String string, String string2) {
        cartPage.yemeklikler.click();
        BrowserUtils.waitFor(3);
        cartPage.salcaSec.click();
    }

    @Then("Verify that product details is visible: product name, category, price, availability, condition, brand")
    public void verify_that_product_details_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertEquals("Hatay Hausgemachtes Tomatenmark", cartPage.salcaBaslik.getText());
        Assert.assertEquals("Auf Lager", cartPage.aufLage.getText());
        Assert.assertEquals("€11,00", cartPage.price.getText());
    }

    @When("Increase the quantity of the product to {int}")
    public void increase_the_quantity_of_the_product_to(Integer int1) {
        for (int sayi = 1; sayi <= 4; sayi++) {
            cartPage.plusButton.click();
        }
    }

    @Then("Verify if the product quantity and price match")
    public void verify_if_the_product_quantity_and_price_match() {
        if (cartPage.quantity.getText() == "5") {
            Assert.assertEquals("€55,00", cartPage.summe.getText());
        }
    }

    @When("Find and click the product named {string}")
    public void find_and_click_the_product_named(String string) {
        cartPage.accept.click();
        searchIcon.searchIcon.sendKeys("Dut Pekmezi");
        searchIcon.enter.click();
    }

    @When("I can click {string} and {string} button")
    public void i_can_click_and_button(String string, String string2) {
        cartPage.sepeteEKle.click();
        BrowserUtils.waitFor(3);
        cartPage.sepetiGor.click();
    }

    @Then("Verify that the price, quantity and total cost details of the product added to the cart are visible.")
    public void verify_that_the_price_quantity_and_total_cost_details_of_the_product_added_to_the_cart_are_visible() {
        Assert.assertEquals("€10,00", cartPage.dutPekmetiPreis.getText());
        Assert.assertEquals("€10,00", cartPage.summeInCart.getText());
    }

    @When("Remove product from cart.")
    public void remove_product_from_cart() {
        cartPage.removeInCart.click();
    }

    @Then("Verify that the product added to the cart has been removed from the cart.")
    public void verify_that_the_product_added_to_the_cart_has_been_removed_from_the_cart() {
        Assert.assertEquals("Sepetiniz boş", cartPage.sepetBos.getText());
    }


}
