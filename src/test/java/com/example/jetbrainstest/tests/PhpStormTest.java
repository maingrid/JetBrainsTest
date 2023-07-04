package com.example.jetbrainstest.tests;
import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.PhpStormPages.PhpStormBlogAndSocialPage;
import com.example.jetbrainstest.pages.PhpStormPages.PhpStormPricingPage;
import com.example.jetbrainstest.pages.PhpStormPages.SearchResultPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MyExtension.class)
public class PhpStormTest extends BaseTest {

    private final PhpStormPricingPage phpStormPricingPage = new PhpStormPricingPage(getDriver());
    private final PhpStormBlogAndSocialPage phpStormBlogAndSocialPage = new PhpStormBlogAndSocialPage(getDriver());


    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/phpstorm/");
    }

    @Test
    @DisplayName("TC1_Проверка нажатия кнопки на главную страницу")
    public void mainPageButtonClickCheck() {
        getPhpStormPage().mainPageButtonClick();
        assertEquals("https://www.jetbrains.com/", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC2_Проверка нажатия кнопки 'загрузка'")
    public void ButtonDownloadPhpStormClickCheck() {
        getPhpStormPage().buttonDownloadPhpStormClick();
        assertEquals("https://www.jetbrains.com/phpstorm/download/#section=windows", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC3_Проверка перехода на страницу цен")
    public void TC3_pricingPageCheck() {
        getPhpStormPage().buttonPricingClick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#commercial", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC4_проверка кликабельности кнопки покупки phpStorm на год")
    public void buttonBuyPhpStormClickableCheck() {
        getPhpStormPage().buttonPricingClick();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormClickable(), "кнопка покупки phpStorm не доступна");
    }

    @Test
    @DisplayName("TC5_проверка кликабельности кнопки покупки All Products Pack на год")
    public void buttonBuyAllProductsPackClickableCheck() {
        getPhpStormPage().buttonPricingClick();
        assertTrue(phpStormPricingPage.buttonBuyAllProductsPackClickable(), "кнопка покупки all products pack не доступна");
    }

    @Test
    @DisplayName("TC6_проверка нажатия кнопки Monthly billing")
    public void buttonMonthlyBillingClick() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#commercial?billing=monthly", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC7_проверка кликабельности кнопки покупки phpStorm на месяц")
    public void buttonBuyPhpStormForOrganizationOnMonthClickableCheck() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormForOrganizationOnMonthClickable(), "кнопка покупки phpStorm не кликабельна");
    }

    @Test
    @DisplayName("TC8_проверка кликабельности кнопки покупки all products pack на месяц")
    public void buttonBuyAllProductsForOrganizationOnMonthClickableCheck() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonMonthlyBilling();
        assertTrue(phpStormPricingPage.buttonBuyAllProductsForOrganizationOnMonthClickable());
    }

    @Test
    @DisplayName("TC9_проверка перехода на страницу с ценами для частного использования")
    public void buttonForIndividualUseClickCheck() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#personal", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC10_проверка кликабельности кнопки покупки phpStorm для собственного использования на год")
    public void buttonBuyForIndividualUseClickableCheck() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertTrue(phpStormPricingPage.buttonBuyPhpStormForIndividualUseClickable(), "кнопка не кликабельна");
    }

    @Test
    @DisplayName("TC11_проверка кликабельности кнопки покупки всех продуктов для собствнного использовая на год")
    public void buttonBuyForIndividualUseAllProductsPackOnYearClickableCheck() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonForIndividualUseClick();
        assertTrue(phpStormPricingPage.buttonBuyForIndividualUseAllProductsPackOnYearClickable(), "кнопка не кликабельна");
    }

    @Test
    @DisplayName("TC12_проверка переходан на страницу специальные предложения")
    public void goToPageSpecialOffersCheck() {
        getPhpStormPage().buttonPricingClick();
        phpStormPricingPage.buttonSpecialOffersCLick();
        assertEquals("https://www.jetbrains.com/phpstorm/buy/#discounts", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC13_проверка перехода на страницу 'что нового'")
    public void goToPageWhatsNewCheck() {
        getPhpStormPage().buttonWhatsNewClick();
        assertEquals("https://www.jetbrains.com/phpstorm/whatsnew/", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC14_проверка перехода на страницу 'блог'")
    public void goToPageBlogAndSocialCheck() {
        getPhpStormPage().buttonBlogAndSocialClick();
        assertEquals("https://www.jetbrains.com/phpstorm/social/", getDriver().getCurrentUrl(), "страница не открылась");
    }

    @Test
    @DisplayName("TC15_проверка отображения заголовка на странице 'блог'")
    public void displayedTitleOnThePageCheck() {
        getPhpStormPage().buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedTitlePostPage(), "заголовок не отображается на странице");
    }

    @Test
    @DisplayName("TC16_проверка отображения поста на странице 'блог'")
    public void displayedPostOnThePageCheck() {
        getPhpStormPage().buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostOnThePage(), "пост не отображается на странице");
    }

    @Test
    @DisplayName("TC17_проверка отображения заголовка поста на странице 'блог'")
    public void displayedPostTitleOnThePageCheck() {
        getPhpStormPage().buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostTitleOnThePage(), "заголовок поста не отображается на странице");
    }

    @Test
    @DisplayName("TC18_проверка отображения даты публикации поста на странице 'блог'")
    public void displayedPostDataPublicationOnThePageCheck() {
        getPhpStormPage().buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostDataPublicationOnThePage(), "дата не отображается");
    }

    @Test
    @DisplayName("TC19_проверка отображения контента в посте")
    public void displayedPostContentOnThePageCheck() {
        getPhpStormPage().buttonBlogAndSocialClick();
        assertTrue(phpStormBlogAndSocialPage.displayedPostContentOnThePage(), "контент в посте не отображается");
    }

    @Test
    @DisplayName("TC20_проверка поиска по слову")
    public void searchCheck() {
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        getPhpStormPage().buttonSearchCLick();
        getPhpStormPage().inputSearchEnterText("aqua");
        assertEquals("aqua", searchResultPage.searchFieldAttribute(), "текст не совпал");
    }
}
