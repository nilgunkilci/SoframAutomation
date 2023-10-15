package com.Sofram.stepsdefinitions;

import com.Sofram.pages.CartPage;
import com.Sofram.pages.HomePage;
import com.Sofram.pages.SideCartPage;
import com.Sofram.pages.SubcategoryPage;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddingAndRemoving_StepsDef {
    HomePage homePage = new HomePage();
    SubcategoryPage subcategoryPage = new SubcategoryPage();
    SideCartPage sideCartPage = new SideCartPage();

    @When("The user adds products to the cart from the home page.")
    public void the_user_adds_products_to_the_cart_from_the_home_page() {
        homePage.addProduct();
    }

    @When("The user clicks the \\(Alışverişe Devam Et) button in the shopping cart opened in the side window.")
    public void the_user_clicks_the_alışverişe_devam_et_button_in_the_shopping_cart_opened_in_the_side_window() {
        homePage.weiterEinkaufen.click();
    }

    @Then("Verify that the user can return to the home page.")
    public void verify_that_the_user_can_return_to_the_home_page() {
        homePage.verifyReturnPage();
    }

    @When("The user adds  product from {string}.")
    public void the_user_adds_product_from(String subcategory) {
        subcategoryPage.addProductFromProductPage(subcategory);
    }

    @Then("Verify that the {string} in your cart section in the pop-up side window.")
    public void verify_that_the_in_your_cart_section_in_the_pop_up_side_window(String expectedNummerOfProduct) {
        BrowserUtils.waitFor(2);
        sideCartPage.verifyintNummerOfProduct(expectedNummerOfProduct);
    }

    @Then("Verify that  the free shipping offer in your cart section in the pop-up side window.")
    public void verify_that_the_free_shipping_offer_in_your_cart_section_in_the_pop_up_side_window() {
        sideCartPage.verifykostenloserVersand();
    }

    @Then("Verify that the Shopping Cart page can be closed with the X icon.")
    public void verify_that_the_shopping_cart_page_can_be_closed_with_the_icon() {
        BrowserUtils.waitFor(1);
        sideCartPage.closeButton.click();
    }

    @And("The user clicks on the kasse button")
    public void theUserClicksOnTheButton() {
        BrowserUtils.waitFor(2);
        sideCartPage.kasse.click();
    }

    @Then("Verify that navigate to the payment page from the cartpage that opens as a side window.")
    public void verify_that_navigate_to_the_payment_page_from_the_cartpage_that_opens_as_a_side_window() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(sideCartPage.lieferung.isDisplayed());
    }

    @And("The user clicks on the cart button")
    public void theUserClicksOnTheCartButton() {
        sideCartPage.clickWarenkorb();
    }

    @Then("Verify that navigate to the cart page from the cartpage that opens as a side window.")
    public void verifyThatNavigateToTheCartPageFromTheCartpageThatOpensAsASideWindow() {
        CartPage cartPage = new CartPage();
        cartPage.verfyIhreWarenkorb();
    }
}
