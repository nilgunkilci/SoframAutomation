package com.Sofram.stepsdefinitions;
import com.Sofram.pages.ProductPage;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductPage_StepsDef {
    ProductPage productPage= new ProductPage();
    int sayi = 0;

    @When("User can click the {string} and the {string}")
    public void user_can_click_the_and_the(String string, String string2) {
        productPage.yemeklikler.click();
        BrowserUtils.waitFor(3);
        productPage.salcaSec.click();
    }
    @Then("Verify that product details is visible: product name, category, price, availability, condition, brand")
    public void verify_that_product_details_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertEquals("Hatay Hausgemachtes Tomatenmark", productPage.salcaBaslik.getText());
        Assert.assertEquals("Auf Lager", productPage.aufLage.getText());
        Assert.assertEquals("€11,00", productPage.price.getText());
    }

    @When("Increase the quantity of the product to {int}")
    public void increase_the_quantity_of_the_product_to(Integer int1) {
        for (int sayi = 1; sayi <= 4; sayi++) {
            productPage.plusButton.click();
        }
    }
    @Then("Verify if the product quantity and price match")
    public void verify_if_the_product_quantity_and_price_match() {
        if (productPage.quantity.getText() == "5") {
            Assert.assertEquals("€55,00", productPage.summe.getText());
        }
    }
}
