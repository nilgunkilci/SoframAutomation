package com.Sofram.stepsdefinitions;

import com.Sofram.pages.LoginPage;
import com.Sofram.pages.SearchIcon;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Search_Icon_StepsDef {
    SearchIcon searchIcon = new SearchIcon();
    LoginPage loginPage = new LoginPage();


    @When("Click on the {string}")
    public void click_on_the(String string) {

        searchIcon.searchIcon.click();
    }

    @When("Enter {string} in the search box and click the search button")
    public void enter_in_the_search_box_and_click_the_search_button(String string) {
        searchIcon.searchIcon.sendKeys("Antep Fıstığı");
        searchIcon.enter.click();
    }

    @Then("Verify whether the search result is correct")
    public void verify_whether_the_search_result_is_correct() {

        Assert.assertEquals("5 ERGEBNIS GEFUNDEN FÜR “ANTEP FISTIĞI”", searchIcon.sonuc.getText());
    }

    @When("Enter Karpuz in the search box and click the search button")
    public void enter_karpuz_in_the_search_box_and_click_the_search_button() {
        searchIcon.searchIcon.sendKeys("Karpuz");
        searchIcon.enter.click();
    }

    @Then("Verify that the message {string} is displayed when the user searches for the item that is not on the website")
    public void verify_that_the_message_is_displayed_when_the_user_searches_for_the_item_that_is_not_on_the_website(String string) {
        Assert.assertEquals("0 ERGEBNIS GEFUNDEN FÜR “KARPUZ”", searchIcon.karpuz.getText());
    }

}
