package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import com.Sofram.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[4]/product-tabs-section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement product1;
    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement accept;
    @FindBy(xpath = "//a[contains(text(),'Mit dem Einkaufen fortfahren')]")
    public WebElement weiterEinkaufen;

    public void addProduct() {
        BrowserUtils.waitFor(5);
        ((JavascriptExecutor)Driver.getDriver()).executeScript("scroll(0,800)");
        product1.click();

    }
    public void verifyReturnPage(){
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyElementDisplayed(product1);
    }

}

