package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "(//*[@class='text p-relative'])[6]")
    public WebElement yemeklikler;

    @FindBy(xpath = "(//*[@title='Hatay Hausgemachtes Tomatenmark'])[4]")
    public WebElement salcaSec;

    @FindBy(xpath = "//*[@class='productView-title']")
    public WebElement salcaBaslik;

    @FindBy(xpath = "(//*[@class='productView-info-value'])[2]")
    public WebElement aufLage;

    @FindBy(xpath = "(//*[@class='money-subtotal'])[1]")
    public WebElement price;
    @FindBy(xpath = "//h1[@class='page-header text-left']")
    public WebElement ihreWarenkorb;

    public void verfyIhreWarenkorb() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(ihreWarenkorb.isDisplayed());
    }
}


