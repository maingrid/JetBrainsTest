package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class PhpStormPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(PhpStormPage.class));
    WebDriver driver;

    @FindBy(xpath = "//a[@href='/phpstorm/download/']")
    public WebElement ButtonDownloadPhpStorm;
    @FindBy(xpath = "//a[@href='/' and @data-test='site-logo']")
    public WebElement mainPageButton;
    @FindBy(xpath = "//a[contains(@class,'wt-col-inline wt-button wt-button_size_s')]")
    private WebElement buttonPricing;
    @FindBy(xpath = "//div[@id='js-menu-second-desktop']//a[@href='/phpstorm/whatsnew/']")
    private WebElement buttonWhatsNew;

    public void mainPageButtonClick(){
        LOG.infoWithScreenshot("нажатие кнопки на 'главную страницу'");
        mainPageButton.click();
    }

    public void ButtonDownloadPhpStormClick() {
        LOG.infoWithScreenshot("нажатие кнопки 'загрузка'");
        ButtonDownloadPhpStorm.click();
    }

    public void buttonPricingClick(){
        LOG.info("нажатие кнопки 'цены'");
        buttonPricing.click();
    }
    public void buttonWhatsNewClick(){
        LOG.info("нажатие кнопки 'что нового'");
        buttonWhatsNew.click();
    }

    public PhpStormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
