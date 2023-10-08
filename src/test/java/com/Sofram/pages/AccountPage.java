package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
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
    @FindBy(xpath = "//a[text()='Mein Konto']")
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
    public void createAccount() {
        BrowserUtils.waitFor(3);

        firstNameInput.sendKeys(generateFirstname());
        lastNameInput.sendKeys(generateLastname());
        emailInput.sendKeys(generateRandomEmail());
        passwordInput.sendKeys(generateRandomPassword());
        BrowserUtils.scrollIntoViewJS(createAccountBtn);
        createAccountBtn.click();
    }
    public void verifyMyAccount(){
        BrowserUtils.waitFor(3);
        myAccount.isDisplayed();
        //BrowserUtils.verifyElementDisplayed(myAccount);
    }
    private String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int length = 10; // E-posta adresinin uzunluğunu istediğiniz gibi ayarlayabilirsiniz
        StringBuilder email = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * allowedChars.length());
            email.append(allowedChars.charAt(index));
        }

        email.append("@gmail.com"); // Örnek bir domain ekleyin

        return email.toString();
    }

    // Rastgele 5 haneli şifre oluşturma
    private String generateRandomPassword() {
        return RandomStringUtils.randomNumeric(5);
    }


    // Rastgele ad oluşturma
    private String generateFirstname() {
        String[] firstnames = {"John", "Jane", "Michael", "Emily", "William", "Olivia", "David", "Sophia"};
        int randomIndex = (int) (Math.random() * firstnames.length);
        return firstnames[randomIndex];
    }

    // Rastgele soyad oluşturma
    private String generateLastname() {
        String[] lastnames = {"Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Anderson"};
        int randomIndex = (int) (Math.random() * lastnames.length);
        return lastnames[randomIndex];
    }

}


