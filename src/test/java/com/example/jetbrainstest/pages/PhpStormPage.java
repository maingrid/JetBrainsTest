package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.tests.PhpStormTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class PhpStormPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(PhpStormTest.class));
    WebDriver driver;

    @FindBy(xpath = "//a[@href='/phpstorm/download/']")
    public WebElement ButtonDownloadPhpStorm;

    @FindBy(xpath = "//a[@href='/' and @data-test='site-logo']")
    public WebElement mainPageButton;

    public void mainPageButtonClick(){
        LOG.infoWithScreenshot("нажатие кнопки на главную страницу");
        mainPageButton.click();
    }

    public void ButtonDownloadPhpStormClick() {
        LOG.infoWithScreenshot("нажатие кнопки загрузка");
        ButtonDownloadPhpStorm.click();
    }

    public PhpStormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
