package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.PhpStormPages.PhpStormBlogAndSocialPage;
import com.example.jetbrainstest.pages.PhpStormPages.PhpStormPage;
import com.example.jetbrainstest.pages.PhpStormPages.PhpStormPricingPage;

import com.example.jetbrainstest.pages.PhpStormPages.SearchResultPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MyExtension.class)
public class PhpStormTest extends BaseTest {

    private PhpStormPricingPage phpStormPricingPage;
    private com.example.jetbrainstest.pages.PhpStormPages.PhpStormPage PhpStormPage;
    private PhpStormBlogAndSocialPage phpStormBlogAndSocialPage;
    private SearchResultPage searchResultPage;

    public void ExplicitWaitUrlToBe(int value, String URL) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(value)).until(ExpectedConditions.urlToBe(URL));
    }

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/phpstorm/");
        PhpStormPage = new PhpStormPage(getDriver());
        phpStormPricingPage = new PhpStormPricingPage(getDriver());
        phpStormBlogAndSocialPage = new PhpStormBlogAndSocialPage(getDriver());

    }

    @Test
    @DisplayName("TC1_Проверка нажатия кнопки на главную страницу")
    public void mainPageButtonClickCheck() {
        PhpStormPage.mainPageButtonClick();
        assertEquals("https://www.jetbrains.com/", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC2_Проверка нажатия кнопки 'загрузка'")
    public void ButtonDownloadPhpStormClickCheck() {
        PhpStormPage.buttonDownloadPhpStormClick();
        assertEquals("https://www.jetbrains.com/phpstorm/download/#section=windows", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC3_Проверка перехода на страницу цен")
    public void TC3_pricingPageCheck() {
        PhpStormPage.buttonPricingClick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#commercial", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC4_проверка кликабельности кнопки покупки phpStorm на год")
    public void buttonBuyPhpStormClickableCheck() {
        PhpStormPage.buttonPricingClick();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormClickable(), "кнопка покупки phpStorm не доступна");
    }

    @Test
    @DisplayName("TC5_проверка кликабельности кнопки покупки All Products Pack на год")
    public void buttonBuyAllProductsPackClickableCheck() {
        PhpStormPage.buttonPricingClick();
        assertTrue(phpStormPricingPage.buttonBuyAllProductsPackClickable(), "кнопка покупки all products pack не доступна");
    }

    @Test
    @DisplayName("TC6_проверка нажатия кнопки Monthly billing")
    public void buttonMonthlyBillingClick() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#commercial?billing=monthly", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC7_проверка кликабельности кнопки покупки phpStorm на месяц")
    public void buttonBuyPhpStormForOrganizationOnMonthClickableCheck() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormForOrganizationOnMonthClickable(), "кнопка покупки phpStorm не кликабельна");
    }

    @Test
    @DisplayName("TC8_проверка кликабельности кнопки покупки all products pack на месяц")
    public void buttonBuyAllProductsForOrganizationOnMonthClickableCheck() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertTrue(phpStormPricingPage.buttonBuyAllProductsForOrganizationOnMonthClickable());
    }

    @Test
    @DisplayName("TC9_проверка перехода на страницу с ценами для частного использования")
    public void buttonForIndividualUseClickCheck() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#personal", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC10_проверка кликабельности кнопки покупки phpStorm для собственного использования на год")
    public void buttonBuyForIndividualUseClickableCheck() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormForIndividualUseClickable(), "кнопка не кликабельна");
    }

    @Test
    @DisplayName("TC11_проверка кликабельности кнопки покупки всех продуктов для собствнного использовая на год")
    public void buttonBuyForIndividualUseAllProductsPackOnYearClickableCheck() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertTrue(phpStormPricingPage.buttonBuyForIndividualUseAllProductsPackOnYearClickable(), "кнопка не кликабельна");
    }

    @Test
    @DisplayName("TC12_проверка переходан на страницу специальные предложения")
    public void goToPageSpecialOffersCheck() {
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonSpecialOffersCLick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#discounts", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC13_проверка перехода на страницу 'что нового'")
    public void goToPageWhatsNewCheck() {
        PhpStormPage.buttonWhatsNewClick();
        assertEquals("https://www.jetbrains.com/phpstorm/whatsnew/", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC14_проверка перехода на страницу 'блог'")
    public void goToPageBlogAndSocialCheck() {
        PhpStormPage.buttonBlogAndSocialClick();
        assertEquals("https://www.jetbrains.com/phpstorm/social/", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC15_проверка отображения заголовка на странице 'блог'")
    public void displayedTitleOnThePageCheck() {
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedTitlePostPage(), "заголовок не отображается на странице");
    }

    @Test
    @DisplayName("TC16_проверка отображения поста на странице 'блог'")
    public void displayedPostOnThePageCheck() {
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostOnThePage(), "пост не отображается на странице");
    }

    @Test
    @DisplayName("TC17_проверка отображения заголовка поста на странице 'блог'")
    public void displayedPostTitleOnThePageCheck() {
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostTitleOnThePage(), "заголовок поста не отображается на странице");
    }

    @Test
    @DisplayName("TC18_проверка отображения даты публикации поста на странице 'блог'")
    public void displayedPostDataPublicationOnThePageCheck() {
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostDataPublicationOnThePage(), "дата не отображается");
    }

    @Test
    @DisplayName("TC19_проверка отображения контента в посте")
    public void displayedPostContentOnThePageCheck() {
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostContentOnThePage(), "контент в посте не отображается");
    }

    @Test
    @DisplayName("TC20_проверка поиска по слову")
    public void SearchCheck() {
        PhpStormPage.buttonSearchCLick();
        PhpStormPage.inputSearchEnterText("aqua");
        assertEquals("aqua", searchResultPage.searchFiledAttribute(), "текст не совпал");
    }
}
