package com.Sofram.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

    @FindBy(xpath = "//a[@id='customer_logout_link']")
    public WebElement AusloggenBUtton;

    @FindBy(xpath = "//img[@alt='sofram24']")
    public WebElement soframIMG;
}
