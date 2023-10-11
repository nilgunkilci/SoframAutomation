package com.Sofram.stepsdefinitions;

import com.Sofram.pages.SubcategoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subcategory_StepsDef {
    SubcategoryPage subcategoryPage = new SubcategoryPage();

    @When("The user clicks on the {string} icon")
    public void the_user_clicks_on_the_icon(String Subcategory) {
        subcategoryPage.clickSubcategories(Subcategory);
    }

    @Then("Verify that the non-registered user should be able to navigate the {string} Page.")
    public void verify_that_the_non_registered_user_should_be_able_to_navigate_the_page(String subcategories) {
        subcategoryPage.verifySubcategoryPage(subcategories);
    }

    @When("The user clicks on the weiterlesen button.")
    public void the_user_clicks_on_the_weiterlesen_button() {
        subcategoryPage.clickWeiterlesen();
    }

    @Then("Verify that the Weiterlesen button is active.")
    public void verify_that_the_weiterlesen_button_is_active() {
        subcategoryPage.verifyWeiterLesenActive();
    }

    @When("The user clicks on the Lese weniger button.")
    public void the_user_clicks_on_the_lese_weniger_button() {
        subcategoryPage.clickLeseWeniger();
    }

    @Then("Verify that the Lese weniger button is active.")
    public void verify_that_the_lese_weniger_button_is_active() {
        subcategoryPage.veriyfLeseWenigerActive();
    }

}
