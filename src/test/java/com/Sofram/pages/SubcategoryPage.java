package com.Sofram.pages;

import com.Sofram.utilities.BrowserUtils;
import com.Sofram.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubcategoryPage extends BasePage{
    @FindBy(xpath = "//a[text()='Nüsse']")
    public WebElement nüssePage;
    @FindBy(xpath = "//span[text()='Nüsse']")
    public WebElement nüsseIcon;
    @FindBy(xpath = "//span[text()='Weiterlesen']")
    public WebElement weiterlesen;
    @FindBy(xpath = "//span[text()='Lese weniger']")
    public WebElement leseWeniger;
    // //div[@class='header__iconItem header__group']//div[@class='cart-count-bubble']/span
    // //div[@class='cart-count-bubble']/span

public void clickSubcategories(String Subcategory){
    Driver.getDriver().findElement(By.xpath("//span[text()='"+Subcategory+"']")).click();

}
public void verifySubcategoryPage(String subcategories){
    BrowserUtils.waitFor(2);
    WebElement subcategory=Driver.getDriver().findElement(By.xpath("//a[text()='"+subcategories+"']"));
    BrowserUtils.verifyElementDisplayed(subcategory);
}
public void clickWeiterlesen(){
    weiterlesen.click();
}
public void verifyWeiterLesenActive(){
    BrowserUtils.verifyElementDisplayed(leseWeniger);
}
public void clickLeseWeniger(){
    BrowserUtils.scrollIntoViewJS(leseWeniger);
    leseWeniger.click();
}public void veriyfLeseWenigerActive(){
    BrowserUtils.verifyElementDisplayed(weiterlesen);
    }
}
