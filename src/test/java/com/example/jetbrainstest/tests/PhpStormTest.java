package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.PhpStormBlogAndSocialPage;
import com.example.jetbrainstest.pages.PhpStormPage;
import com.example.jetbrainstest.pages.PhpStormPricingPage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MyExtension.class)
public class PhpStormTest extends BaseTest{

    private PhpStormPricingPage phpStormPricingPage;
    private com.example.jetbrainstest.pages.PhpStormPage PhpStormPage;
    private PhpStormBlogAndSocialPage phpStormBlogAndSocialPage;

    @BeforeEach
    @Override
    public void setUp(){
        super.setUp();
        getDriver().get("https://www.jetbrains.com/phpstorm/");
        PhpStormPage = new PhpStormPage(getDriver());
        phpStormPricingPage = new PhpStormPricingPage(getDriver());
        phpStormBlogAndSocialPage = new PhpStormBlogAndSocialPage(getDriver());
    }
    @Test
    @DisplayName("Проверка нажатия кнопки на главную страницу")
    public void TC1_mainPageButtonClickCheck(){
        PhpStormPage.mainPageButtonClick();
        assertEquals("https://www.jetbrains.com/", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("Проверка нажатия кнопки 'загрузка'")
    public void TC2_ButtonDownloadPhpStormClickCheck(){
        PhpStormPage.ButtonDownloadPhpStormClick();
        assertEquals("https://www.jetbrains.com/phpstorm/download/#section=windows" , getDriver().getCurrentUrl(),"страница не открылась");
    }
    @Test
    @DisplayName("Проверка перехода на страницу цен")
    public void TC3_pricingPageCheck(){
        PhpStormPage.buttonPricingClick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#commercial", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("проверка кликабельности кнопки покупки phpStorm на год")
    public void TC4_buttonBuyPhpStormClickableCheck(){
        PhpStormPage.buttonPricingClick();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormClickable(),"кнопка покупки phpStorm не доступна");
    }
    @Test
    @DisplayName("проверка кликабельности кнопки покупки All Products Pack на год")
    public void TC5_buttonBuyAllProductsPackClickableCheck(){
        PhpStormPage.buttonPricingClick();
        assertTrue(phpStormPricingPage.buttonBuyAllProductsPackClickable(),"кнопка покупки all products pack не доступна");
    }
    @Test
    @DisplayName("проверка нажатия кнопки Monthly billing")
    public void TC6_buttonMonthlyBillingClick(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#commercial?billing=monthly", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("проверка кликабельности кнопки покупки phpStorm на месяц")
    public void TC7_buttonBuyPhpStormForOrganizationOnMonthClickableCheck(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormForOrganizationOnMonthClickable(), "кнопка покупки phpStorm не кликабельна");
    }
    @Test
    @DisplayName("проверка кликабельности кнопки покупки all products pack на месяц")
    public void TC8_buttonBuyAllProductsForOrganizationOnMonthClickableCheck(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertTrue(phpStormPricingPage.buttonBuyAllProductsForOrganizationOnMonthClickable());
    }
    @Test
    @DisplayName("проверка перехода на страницу с ценами для частного использования")
    public void TC9_buttonForIndividualUseClickCheck(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#personal?billing=yearly", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("проверка кликабельности кнопки покупки phpStorm для собственного использования на год")
    public void TC10_buttonBuyForIndividualUseClickableCheck(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormForIndividualUseClickable(), "кнопка не кликабельна");
    }
    @Test
    @DisplayName("проверка кликабельности кнопки покупки всех продуктов для собствнного использовая на год")
    public void TC11_buttonBuyForIndividualUseAllProductsPackOnYearClickableCheck(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertTrue(phpStormPricingPage.buttonBuyForIndividualUseAllProductsPackOnYearClickable(), "кнопка не кликабельна");
    }
    @Test
    @DisplayName("проверка переходан на страницу специальные предложения")
    public void TC12_goToPageSpecialOffersCheck(){
        PhpStormPage.buttonPricingClick();
        phpStormPricingPage.buttonSpecialOffersCLick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#discounts", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("проверка перехода на страницу 'что нового'")
    public void TC13_goToPageWhatsNewCheck(){
        PhpStormPage.buttonWhatsNewClick();
        assertEquals("https://www.jetbrains.com/phpstorm/whatsnew/", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("проверка перехода на страницу 'блог'")
    public void TC14_goToPageBlogAndSocialCheck(){
        PhpStormPage.buttonBlogAndSocialClick();
        assertEquals("https://www.jetbrains.com/phpstorm/social/", getDriver().getCurrentUrl(), "страница не открылась");
    }
    @Test
    @DisplayName("проверка отображения заголовка на странице 'блог'")
    public void TC15_displayedTitleOnThePageCheck(){
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedTitlePostPage(), "заголовок не отображается на странице");
    }
    @Test
    @DisplayName("проверка отображения поста на странице 'блог'")
    public void TC16_displayedPostOnThePageCheck(){
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostOnThePage(), "пост не отображается на странице");
    }
    @Test
    @DisplayName("проверка отображения заголовка поста на странице 'блог'")
    public void TC17_displayedPostTitleOnThePageCheck(){
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostTitleOnThePage(), "заголовок поста не отображается на странице");
    }
    @Test
    @DisplayName("проверка отображения даты публикации поста на странице 'блог'")
    public void TC18_displayedPostDataPublicationOnThePageCheck(){
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostDataPublicationOnThePage(), "дата не отображается");
    }
    @Test
    @DisplayName("проверка отображения контента в посте")
    public void TC19_displayedPostContentOnThePageCheck(){
        PhpStormPage.buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostContentOnThePage(), "контент в посте не отображается");
    }
    @Test
    @DisplayName("проверка поиска по слову")
    public void TC20_SearchCheck(){
        PhpStormPage.buttonSearchCLick();
        PhpStormPage.inputSearchEnterText("aqua");
        assertEquals("aqua", PhpStormPage.searchFiledAttribute(), "текст не совпал");

    }
}
