package com.Sofram.stepsdefinitions;

import com.Sofram.pages.LoginPage;
import com.Sofram.pages.LogoutPage;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Logout_StepsDef {
    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();

    @When("The user clicks to Ausloggen")
    public void theUserClicksToAusloggen() {
        logoutPage.AusloggenBUtton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that the user should be able to log out on the Home Page")
    public void verifyThatTheUserShouldBeAbleToLogOutOnTheHomePage() {
        BrowserUtils.verifyElementDisplayed(logoutPage.soframIMG);
        BrowserUtils.verifyElementDisplayed(loginPage.einloggen);

    }
}
