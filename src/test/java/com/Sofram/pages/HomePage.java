package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import com.Sofram.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[4]/product-tabs-section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement product1;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[4]/product-tabs-section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement product2;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[4]/product-tabs-section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement product3;
    @FindBy (xpath = "//a[@class='card-link'and@title='Hatay Ev Yapımı Domates Salçası']")
    public WebElement hataySalca;
    @FindBy(id = "times-solid")
    public WebElement cookiesClose;
    @FindBy(xpath = "//span[text()='Alle akzeptieren']")
    public WebElement akzeptieren;
    @FindBy(xpath = "//button[@style='background-color: rgb(44, 145, 87); color: rgb(255, 255, 255); border-radius: 0.375rem;']")
    public WebElement ablehnen;
    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement accept;
    @FindBy(xpath = "//a[contains(text(),'Mit dem Einkaufen fortfahren')]")
    public WebElement weiterEinkaufen;

    public void addProduct() {
        BrowserUtils.waitFor(5);
        // Datenschutz tiklanmiyor. Tiklanmadigi icin kapatilamiyor.
       // cookiesClose.click();
        //accept.click();
        //ablehnen.click();
        //BrowserUtils.scrollToElement(product1);
        ((JavascriptExecutor)Driver.getDriver()).executeScript("scroll(0,800)");
        product1.click();

    }
    public void verifyReturnPage(){
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyElementDisplayed(product1);
    }

}

