package com.example.jetbrainstest.pages.PhpStormPages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class SearchResultPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(PhpStormPage.class));
    WebDriver driver;

    @FindBy(xpath = "//input[@class='_wt-input__inner_1pdmso7_92']")
    private WebElement searchFiled;


    public String searchFiledAttribute(){
        String val = searchFiled.getAttribute("value");
        LOG.info("Ва строке поиска текст:" + val);
        return val;
    }


    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
