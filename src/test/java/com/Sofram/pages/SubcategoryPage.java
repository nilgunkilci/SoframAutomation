package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import com.Sofram.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubcategoryPage extends BasePage {
    @FindBy(xpath = "//span[text()='Weiterlesen']")
    public WebElement weiterlesen;
    @FindBy(xpath = "//span[text()='Lese weniger']")
    public WebElement leseWeniger;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement nüsse1;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement KürbisMarmalade;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement honigWrap;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement tahin;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement olivenol;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
    public WebElement tomatenmark;

    public void clickSubcategories(String Subcategory) {
        Driver.getDriver().findElement(By.xpath("//span[text()='" + Subcategory + "']")).click();
    }

    public void verifySubcategoryPage(String subcategories) {
        BrowserUtils.waitFor(2);
        WebElement subcategory = Driver.getDriver().findElement(By.xpath("//a[text()='" + subcategories + "']"));
        BrowserUtils.verifyElementDisplayed(subcategory);
    }

    public void clickWeiterlesen() {
        weiterlesen.click();
    }

    public void verifyWeiterLesenActive() {
        BrowserUtils.verifyElementDisplayed(leseWeniger);
    }

    public void clickLeseWeniger() {
        BrowserUtils.scrollIntoViewJS(leseWeniger);
        leseWeniger.click();
    }

    public void veriyfLeseWenigerActive() {
        BrowserUtils.verifyElementDisplayed(weiterlesen);
    }

    public void addProductFromProductPage(String subcategory) {
        BrowserUtils.waitFor(2);
        if (subcategory.equals("Nüsse")) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,400)");
            BrowserUtils.waitFor(2);
            nüsse1.click();

        } else if (subcategory.equals("Frühstücksartikel")) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,400)");
            BrowserUtils.waitFor(2);
            KürbisMarmalade.click();

        } else if (subcategory.equals("Türkischer Leckerbissen und Pestilenz")) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,800)");
            BrowserUtils.waitFor(2);
            honigWrap.click();


        } else if (subcategory.equals("Bäckereiprodukte und Desserts")) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,400)");
            BrowserUtils.waitFor(2);
            tahin.click();

        } else if (subcategory.equals("Spezielle Öle und Saucen")) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,400)");
            BrowserUtils.waitFor(2);
            olivenol.click();

        } else if (subcategory.equals("Nährmittel")) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,400)");
            BrowserUtils.waitFor(2);
            tomatenmark.click();

        }
    }
}

