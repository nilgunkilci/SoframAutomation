package com.Sofram.stepsdefinitions;

import com.Sofram.pages.RegisterPage;
import com.Sofram.pages.LoginPage;
import com.Sofram.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Register_StepsDef {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @When("The user clicks on the Register")
    public void the_user_clicks_on_the_register() {
        loginPage.einKontoErstellen.click();
    }

    @When("The user enters valid {string} and {string} and {string} , {string} and clicks account button")
    public void the_user_enters_valid_and_and_and_clicks_account_button(String firstName, String lastName, String email, String password) {
        registerPage.createAccount(firstName, lastName, email, password);
    }

    @Then("Verify that the user can create a user account.")
    public void verify_that_the_user_can_create_a_user_account() {
        registerPage.verifyMyAccount();
    }

    @When("The user enters valid firstName, lastName, email, password and clicks account button")
    public void the_user_enters_valid_first_name_last_name_email_password_and_clicks_account_button() {
        registerPage.createAccount();
    }

    @Then("Verify access to the Register page.")
    public void verify_access_to_the_register_page() {
        registerPage.verifyKontoErstellenPage();
    }

    @When("The user enters {string} and {string} and {string} and {string} and clicks account button")
    public void the_user_enters_and_and_and_and_clicks_account_button(String firstName, String lastName, String email, String password) {
        registerPage.createAccount(firstName, lastName, email, password);
    }

    @Then("Verify the warning message {string}")
    public void verify_the_warning_message(String expectedMessage) {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedMessage, registerPage.getDisappearingWarningMessage(expectedMessage));
    }

    @Then("Verify the warning message {string} for password")
    public void verify_the_warning_message_for_password(String expectedMessage) {
        registerPage.verifyBlankPasswordmessage(expectedMessage);
    }
}
