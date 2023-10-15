package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideCartPage extends BasePage {
    @FindBy(xpath = "//span[@class='cartCount']")
    public WebElement cartCount;
    @FindBy(xpath = "//div[@class='progress-truck-wrapper']")
    public WebElement versandTruck;
    @FindBy(xpath = "//div[@id='halo-cart-sidebar']//button[@aria-label='Nah dran'][normalize-space()='Nah dran']//*[name()='svg']//*[name()='path' and contains(@d,'M 38.98242')]")
    public WebElement closeButton;
    @FindBy(xpath = "//button[@class='button button-1 button-checkout']")
    public WebElement kasse;
    @FindBy(xpath = "//h2[text()='Lieferung']")
    public WebElement lieferung;
    @FindBy(xpath = "//a[@class='button button-2 button-view-cart']")
    public WebElement warenkorbButton;

    public void verifyintNummerOfProduct(String expectedNummerOfProduct) {
        Assert.assertEquals(expectedNummerOfProduct, cartCount.getText());

    }

    public void verifykostenloserVersand() {
        BrowserUtils.waitFor(5);
        BrowserUtils.verifyElementDisplayed(versandTruck);
    }

    public void clickWarenkorb() {
        HomePage homePage = new HomePage();
        homePage.accept.click();
        BrowserUtils.waitFor(2);
        warenkorbButton.click();

    }
}
