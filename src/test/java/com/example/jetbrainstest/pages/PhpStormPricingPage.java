package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class PhpStormPricingPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(PhpStormPricingPage.class));
    WebDriver driver;

    @FindBy(xpath = "//div[@class='wt-col-inline wt-offset-top-12']/a[@href='https://www.jetbrains.com/shop/buy?item=C:N:PS:Y']")
    private WebElement buttonBuyPhpStormForOrganizationOnYear;
    @FindBy(xpath = "//div[@class='wt-col-inline wt-offset-top-12']/a[@href='https://www.jetbrains.com/shop/buy?item=C:N:ALL:Y']")
    private WebElement buttonBuyAllProductsPackForOrganizationOnYear;
    @FindBy(xpath = "//div[@class='wt-css-content-switcher__block']//button[@class='_option_1rsg9c6_33']")
    private WebElement buttonMonthlyBilling;
    @FindBy(xpath = "//a[@href='https://www.jetbrains.com/shop/buy?item=C:N:PS:M']")
    private WebElement buttonBuyPhpStormForOrganizationOnMonth;
    @FindBy(xpath = "//a[@href='https://www.jetbrains.com/shop/buy?item=C:N:ALL:M']")
    private WebElement buttonBuyAllProductsPackForOrganizationOnMonth;
    @FindBy(xpath = "//div[@class='_tab_1w1guee_13 _selected_1w1guee_141 jb-buy-page__tab']")
    private WebElement buttonForIndividualUse;
    @FindBy(xpath = "//a[@href='https://www.jetbrains.com/shop/buy?item=P:N:PS:Y']")
    private WebElement buttonBuyForIndividualUseOnYear;
    @FindBy(xpath = "//a[@href='https://www.jetbrains.com/shop/buy?item=P:N:ALL:Y']")
    private WebElement buttonBuyForIndividualUseAllProductsPackOnYear;
    @FindBy(xpath = "//div[contains(@class,'_tab_1w1guee_13')]/div[text()='Special Offers']")
    private WebElement buttonSpecialOffers;


    public Boolean buttonBuyPhpStormClickable(){
        LOG.info("Проверка активности кнопки покупки phpStorm");
        return buttonBuyPhpStormForOrganizationOnYear.isEnabled();
    }
    public Boolean buttonBuyAllProductsPackClickable(){
        LOG.info("Проверка активности кнопки покупки All Products Pack");
        return buttonBuyAllProductsPackForOrganizationOnYear.isEnabled();
    }
    public void buttonMonthlyBilling(){
        LOG.info("Нажатие кнопки Monthly biling");
        buttonMonthlyBilling.click();
    }
    public Boolean buttonBuyPhpStormForOrganizationOnMonthClickable(){
        LOG.info("нажатие кнопки покупки phpStorm");
        return buttonBuyPhpStormForOrganizationOnMonth.isEnabled();
    }
    public Boolean buttonBuyAllProductsForOrganizationOnMonthClickable(){
        LOG.info("нажатие кнопки покупки phpStorm");
        return buttonBuyAllProductsPackForOrganizationOnMonth.isEnabled();
    }
    public void buttonForIndividualUseClick(){
        LOG.info("нажатие кнопки For individual use");
        buttonForIndividualUse.click();
    }
    public Boolean buttonBuyPhpStormForIndividualUseClickable(){
        LOG.info("нажатие кнопки покупки phpStorm для собственного использования на год");
        return buttonBuyForIndividualUseOnYear.isEnabled();
    }
    public Boolean buttonBuyForIndividualUseAllProductsPackOnYearClickable(){
        LOG.info("нажатие кнопки покупки всех продуктов для собсвтенного использования на год");
        return buttonBuyForIndividualUseAllProductsPackOnYear.isEnabled();
    }
    public void buttonSpecialOffersCLick(){
        LOG.info("нажатие кнопки специальные предложения");
        buttonSpecialOffers.click();
    }

    public PhpStormPricingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
