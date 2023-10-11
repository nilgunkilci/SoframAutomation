package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
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
    @FindBy(xpath = "//a[text()='Mein Konto']")
    public WebElement myAccount;
    @FindBy(xpath = "//span[text()='Alle akzeptieren']")
    public WebElement cookiesBtn;
    @FindBy(xpath = "//span[text()='Konto erstellen']")
    public WebElement kontoErstellenPage;
    @FindBy(xpath = "//span[contains(text(),'E-mail')]")
    public WebElement eMailIstUngultig;
    @FindBy(xpath = "//li[contains(text(),'Diese E-Mail Adresse ist bereits vergeben. Wenn es')]")
    public WebElement eMailIstVergeben;
    @FindBy(xpath = "//a[@class='link link-underline']//span[@class='text'][contains(text(),'Passwort')]")
    public WebElement passwordistKurz;

    public void createAccount(String firstName, String lastName, String email, String password) {
        BrowserUtils.waitFor(3);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        BrowserUtils.scrollIntoViewJS(createAccountBtn);
        createAccountBtn.click();
    }

    public void createAccount() {
        BrowserUtils.waitFor(3);
        firstNameInput.sendKeys(generateFirstname());
        lastNameInput.sendKeys(generateLastname());
        emailInput.sendKeys(generateRandomEmail());
        passwordInput.sendKeys(generateRandomPassword());
        BrowserUtils.scrollIntoViewJS(createAccountBtn);
        createAccountBtn.click();
    }

    public void verifyMyAccount() {
        BrowserUtils.waitFor(30);
        myAccount.isDisplayed();
    }

    private String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int length = 10;
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * allowedChars.length());
            email.append(allowedChars.charAt(index));
        }
        email.append("@gmail.com");
        return email.toString();
    }

    private String generateRandomPassword() {
        return RandomStringUtils.randomNumeric(5);
    }

    private String generateFirstname() {
        String[] firstnames = {"John", "Jane", "Michael", "Emily", "William", "Olivia", "David", "Sophia"};
        int randomIndex = (int) (Math.random() * firstnames.length);
        return firstnames[randomIndex];
    }

    private String generateLastname() {
        String[] lastnames = {"Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Anderson"};
        int randomIndex = (int) (Math.random() * lastnames.length);
        return lastnames[randomIndex];
    }

    public void verifyKontoErstellenPage() {
        BrowserUtils.verifyElementDisplayed(kontoErstellenPage);
    }

    public String getDisappearingWarningMessage(String expectedMessage) {
        String actualMessage = null;
        if (expectedMessage.contains("alexmuller") || expectedMessage.contains("Punktzeichen")) {
            actualMessage = emailInput.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        } else if (expectedMessage.contains("ungültig")) {
            BrowserUtils.waitFor(30);
            actualMessage = eMailIstUngultig.getText();
            System.out.println("actualMessage = " + actualMessage);
        } else if (expectedMessage.contains("Fülle")) {
            BrowserUtils.waitFor(3);
            actualMessage = emailInput.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        } else {
            BrowserUtils.waitFor(30);
            actualMessage = passwordistKurz.getText();
            System.out.println("actualMessage = " + actualMessage);
        }
        return actualMessage;
    }

    public String getDisappearingWarningMessage2(String email) {
        String actualMessage = null;
        if (email.contains("alexmuller")) {
            actualMessage = emailInput.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        } else if (!email.contains("alexmuller")) {
            actualMessage = passwordInput.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        }

        return actualMessage;
    }
    public void verifyBlankPasswordmessage(String expectedMessage){
        String actualMessage =passwordInput.getAttribute("validationMessage");
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}


