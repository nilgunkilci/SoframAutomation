package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath= "(//*[@id='product-add-to-cart'])[10]")
    public WebElement sepeteEKle;

    @FindBy(xpath= "(//*[@href='/de/cart'])[4]")
    public WebElement sepetiGor;

    @FindBy(xpath= "(//*[@class='price price--end'])[2]")
    public WebElement dutPekmetiPreis;
    @FindBy(xpath= "//*[@class='cart-item-value']")
    public WebElement summeInCart;

    @FindBy(xpath= "(//*[@id='upsell-update-43568787816662'])[2]")
    public WebElement mengeInCart;

    @FindBy(xpath= "//*[@class='cc-btn cc-allow isense-cc-btn isense-cc-allow isense-cc-submit-consent']")
    public WebElement accept;

    @FindBy(xpath= "(//*[@class='cart-remove'])[2]")
    public WebElement removeInCart;

    @FindBy(xpath= "(//*[@class='cart-text'])[2]")
    public WebElement sepetBos;

    @FindBy(xpath= "(//*[@class='halo-sidebar-close button-effect'])[2]")
    public WebElement kapat;

    @FindBy(xpath= "(//*[@class='cart-total-value'])[4]")
    public WebElement total;

    @FindBy(xpath= "//*[@class='button button-2 button-continue']")
    public WebElement alisveriseDevamEt;
  
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
   
  
    @FindBy(xpath= "//*[@class='collection-title page-header text-left']")
    public WebElement angebot;
  
   @FindBy(xpath = "//h1[@class='page-header text-left']")
    public WebElement ihreWarenkorb;
  
   public void verfyIhreWarenkorb() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(ihreWarenkorb.isDisplayed());
    }
}


