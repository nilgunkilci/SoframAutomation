package com.Sofram.stepsdefinitions;
import com.Sofram.pages.CartPage;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartPage_StepsDef {
    CartPage cartPage = new CartPage();
    @When("User can click the {string} and the {string}")
    public void user_can_click_the_and_the(String string, String string2) {
        cartPage.yemeklikler.click();
        BrowserUtils.waitFor(3);
        cartPage.salcaSec.click();
    }

    @Then("Verify that product details is visible: product name, category, price, availability, condition, brand")
    public void verify_that_product_details_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertEquals("Hatay Hausgemachtes Tomatenmark", cartPage.salcaBaslik.getText());
        Assert.assertEquals("Auf Lager",cartPage.aufLage.getText());
        Assert.assertEquals("€11,00",cartPage.price.getText());
    }
}
