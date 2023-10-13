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

    @When("Click the product named Dut Pekmezi and Kabuklu Ceviz click Sepete Ekle button")
    public void click_the_product_named_dut_pekmezi_and_kabuklu_ceviz_click_sepete_ekle_button() {
        cartPage.accept.click();
        searchIcon.searchIcon.sendKeys("Dut Pekmezi");
        searchIcon.enter.click();
        cartPage.sepeteEKle.click();
        cartPage.kapat.click();
        BrowserUtils.waitFor(3);
        searchIcon.searchIcon.clear();
        searchIcon.searchIcon.sendKeys("Kabuklu Ceviz");
        searchIcon.enter.click();
        cartPage.sepeteEKle.click();
        cartPage.sepetiGor.click();
    }

    @Then("Verify that the calculation of the order summary on the Your Cart page.")
    public void verify_that_the_calculation_of_the_order_summary_on_the_your_cart_page() {
        Assert.assertEquals("€22,00", cartPage.total.getText());
    }

    @When("Click on the Alisverise Devam Et button")
    public void click_on_the_alisverise_devam_et_button() {
        cartPage.alisveriseDevamEt.click();
    }
    @Then("Verify that you can access the previous page with the {string} button on your cart page.")
    public void verify_that_you_can_access_the_previous_page_with_the_button_on_your_cart_page(String string) {
        Assert.assertEquals("ANGEBOTE", cartPage.angebot.getText());
    }


}
