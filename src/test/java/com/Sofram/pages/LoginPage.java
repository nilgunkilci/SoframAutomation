package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import com.Sofram.utilities.ConfigurationReader;
import com.Sofram.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@id='times-solid']")
    public WebElement cookiesCloseButton;
    @FindBy(xpath = "//span[text()='Ablehnen']")
    public WebElement cookiesAblehnenButton;
    @FindBy(xpath = "//*[@aria-label='Dismiss']")
    public WebElement spracheCloseButton;
    @FindBy(css = "a[class='header__link--account customer_login_link']a[class='header__link--account customer_login_link']")
    public WebElement SingIn;
    @FindBy(xpath = "//a[text()='Einloggen']")
    public WebElement einloggen;
    @FindBy(xpath = " //span[text()='Anmeldung']")
    public WebElement anmeldungPage;
    @FindBy(xpath = "//h1[@class='page-header']")
    public WebElement einloggenPage;
    @FindBy(xpath = "//p[@class='alertBox-message']")
    public WebElement warningMessage;
    @FindBy(xpath = "//input[@id='customer_email']")
    public WebElement inputEmailBox;
    @FindBy(xpath = "//input[@id='customer_password']")
    public WebElement inputPasswordBox;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement einloggenButton;
    @FindBy(xpath = "//h1[@class='page-header']")
    public WebElement meinKontoPage;
    @FindBy(xpath = "//a[text()='Ein Konto erstellen']")
    public WebElement einKontoErstellen;

    public void login() {
        inputEmailBox.sendKeys(ConfigurationReader.get("userName"));
        inputPasswordBox.sendKeys(ConfigurationReader.get("userPassword"));
        einloggenButton.click();
    }
    public void login(String email, String password) {
        inputEmailBox.sendKeys(email);
        inputPasswordBox.sendKeys(password);
        einloggenButton.click();
    }
}


