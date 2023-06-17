package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class PhpStormBlogAndSocialPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(PhpStormPricingPage.class));

    @FindBy(xpath = "//div[@class='posts-section wt-col-8']//h2[@class='posts-section__title']")
    private WebElement titlePostsPage;
    @FindBy(xpath = "//div[@class='js-posts-list']/a[1]")
    private WebElement postOnThePage;
    @FindBy(xpath = "//div[@class='js-posts-list']/a[1]/a")
    private WebElement postTitleOnThePage;
    @FindBy(xpath = "//div[@class='js-posts-list']/a[1]/div[@class='post__info']/span")
    private WebElement postDataPublicationOnThePage;
    @FindBy(xpath = "//div[@class='js-posts-list']/a[1]/div[@class='post__content']")
    private WebElement postContentOnThePage;

    public Boolean displayedTitlePostPage(){
        LOG.info("отображение заголовка на странице 'блог'");
        return titlePostsPage.isDisplayed();
    }
    public Boolean displayedPostOnThePage(){
        LOG.info("отоброжение поста на странице 'блог'");
        return postOnThePage.isDisplayed();
    }
    public Boolean displayedPostTitleOnThePage(){
        LOG.info("отображение заголовка поста нас странице 'блог'");
        return postTitleOnThePage.isDisplayed();
    }
    public Boolean displayedPostDataPublicationOnThePage(){
        LOG.info("отображение даты публикации поста на странице 'блог'");
        return postDataPublicationOnThePage.isDisplayed();
    }
    public Boolean displayedPostContentOnThePage(){
        LOG.info("отображение текста поста на странице 'блог'");
        return postContentOnThePage.isDisplayed();
    }
    public PhpStormBlogAndSocialPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
