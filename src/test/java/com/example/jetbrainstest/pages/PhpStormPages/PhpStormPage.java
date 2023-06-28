package com.example.jetbrainstest.pages.PhpStormPages;

import com.example.jetbrainstest.AllureLogger;


import org.openqa.selenium.Keys;
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
    @FindBy(xpath = "//div[@id='js-menu-second-desktop']//a[@href='/phpstorm/social/']")
    private WebElement buttonBlogAndSocial;
    @FindBy(xpath = "//button[@data-test='site-header-search-action']")
    private WebElement buttonSearch;
    @FindBy(xpath = "//input[@data-test='search-input']")
    private WebElement inputSearch;
    @FindBy(xpath = "//div[@class='_wt-input__field_1pdmso7_53']")
    private WebElement searchFiled;


    public void mainPageButtonClick() {
        LOG.infoWithScreenshot("нажатие кнопки на 'главную страницу'");
        mainPageButton.click();
    }

    public void buttonDownloadPhpStormClick() {
        LOG.infoWithScreenshot("нажатие кнопки 'загрузка'");
        ButtonDownloadPhpStorm.click();
    }

    public void buttonPricingClick() {
        LOG.info("нажатие кнопки 'цены'");
        buttonPricing.click();
    }

    public void buttonWhatsNewClick() {
        LOG.info("нажатие кнопки 'что нового'");
        buttonWhatsNew.click();
    }

    public void buttonBlogAndSocialClick() {
        LOG.info("нажатие кнопки 'блог'");
        buttonBlogAndSocial.click();
    }

    public void buttonSearchCLick() {
        LOG.info("нажатие кнопки поиска");
        buttonSearch.click();
    }

    public void inputSearchEnterText(String text) {
        LOG.info("ввод текста ");
        inputSearch.sendKeys(text);
        inputSearch.sendKeys(Keys.ENTER);
    }

    public PhpStormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
