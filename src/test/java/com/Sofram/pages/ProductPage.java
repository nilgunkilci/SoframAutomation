package com.Sofram.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath ="(//*[@class='text p-relative'])[6]")
public WebElement yemeklikler;

    @FindBy(xpath= "(//*[@title='Hatay Hausgemachtes Tomatenmark'])[4]")
    public WebElement salcaSec;

    @FindBy(xpath= "//*[@class='productView-title']")
    public WebElement salcaBaslik;

    @FindBy(xpath= "(//*[@class='productView-info-value'])[2]")
    public WebElement aufLage;

    @FindBy(xpath= "(//*[@class='money-subtotal'])[1]")
    public WebElement price;

    @FindBy(xpath= "(//*[@class='plus btn-quantity'])[1]")
    public WebElement plusButton;

    @FindBy(xpath= "//*[@id='quantity-7846879297750-2']")
    public WebElement quantity;

    @FindBy(xpath= "(//*[@class='money-subtotal'])[1]")
    public WebElement summe;

}
