package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    LoginPage loginPage = new LoginPage();
    @FindBy(id = "RegisterForm-FirstName")
    public WebElement firstNameInput;
    @FindBy(id = "RegisterForm-LastName")
    public WebElement lastNameInput;
    @FindBy(id = "RegisterForm-email")
    public WebElement emailInput;
    @FindBy(id = "RegisterForm-password")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@class='button button--primary']")
    public WebElement createAccountBtn;
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;
    @FindBy(xpath = "//span[text()='Alle akzeptieren']")
    public WebElement cookiesBtn;

    public void createAccount(String firstName, String lastName, String email, String password) {
        BrowserUtils.waitFor(3);

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        BrowserUtils.scrollIntoViewJS(createAccountBtn);
        createAccountBtn.click();
    }
    public void verifyMyAccount(){
        BrowserUtils.verifyElementDisplayed(myAccount);
    }

}
