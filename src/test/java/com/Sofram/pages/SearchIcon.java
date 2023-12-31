package com.Sofram.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchIcon extends BasePage {

    @FindBy(xpath = "//*[@id='Search-In-Modal-Classic']")
    public WebElement searchIcon;

    @FindBy(xpath = "(//*[@class='icon-search-1'])[1]")
    public WebElement enter;

    @FindBy(xpath = "//*[@class='page-header text-center']")
    public WebElement sonuc;

    @FindBy(xpath ="//*[@class='page-header text-center']")
    public  WebElement karpuz;

}
