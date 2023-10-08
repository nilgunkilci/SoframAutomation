package com.Sofram.stepsdefinitions;

import com.Sofram.pages.AccountPage;
import com.Sofram.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_StepsDef {
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @When("The user clicks on the Register")
    public void the_user_clicks_on_the_register() {
        loginPage.einKontoErstellen.click();
    }

    @When("The user enters valid {string} and {string} and {string} , {string} and clicks account button")
    public void the_user_enters_valid_and_and_and_clicks_account_button(String firstName, String lastName, String email, String password) {
        accountPage.createAccount(firstName, lastName, email, password);
    }

    @Then("Verify that the user can create a user account.")
    public void verify_that_the_user_can_create_a_user_account() {
        accountPage.verifyMyAccount();
    }

    @When("The user enters valid firstName, lastName, email, password and clicks account button")
    public void the_user_enters_valid_first_name_last_name_email_password_and_clicks_account_button() {
        accountPage.createAccount();
    }
}
