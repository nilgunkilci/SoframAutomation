package com.Sofram.stepsdefinitions;

import com.Sofram.pages.LoginPage;
import com.Sofram.utilities.BrowserUtils;
import com.Sofram.utilities.ConfigurationReader;
import com.Sofram.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepsDef {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the Home Page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.get("url"));


        BrowserUtils.waitFor(5);
         loginPage.spracheCloseButton.click();
        BrowserUtils.waitFor(5);
        //loginPage.cookiesAblehnenButton.click();
        //BrowserUtils.waitFor(5);

    }

    @When("The user clicks to Sing In")
    public void the_user_clicks_to_sing_in() {
        loginPage.einloggen.click();
    }

    @When("The user enters correct {string} , <{string}> and clicks black login button")
    public void the_user_enters_correct_and_clicks_black_login_button(String string, String string2) {
        loginPage.login();
    }

    @Then("The user should be able to login sofram website")
    public void the_user_should_be_able_to_login_sofram_website() {
       BrowserUtils.verifyElementDisplayed(loginPage.meinKontoPage);

    }
}
