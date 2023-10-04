package com.Sofram.stepsdefinitions;

import com.Sofram.pages.BasePage;
import com.Sofram.pages.LoginPage;
import com.Sofram.pages.SearchIcon;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Icon {
    SearchIcon searchIcon= new SearchIcon();
    LoginPage loginPage= new LoginPage();



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

    }

}
