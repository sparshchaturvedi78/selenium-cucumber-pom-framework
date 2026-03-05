package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArticlePage extends BaseTest {

    By newArticleBtn = By.xpath("//a[text()='New Article']");

    By title = By.xpath("//input[@placeholder='Article Title']");
    By about = By.xpath("//input[contains(@placeholder,'article about')]");
    By body = By.xpath("//textarea[@placeholder='Write your article (in markdown)']");
    By publish = By.xpath("//button[contains(text(),'Publish Article')]");

    By updateArticleBtn = By.xpath("//button[contains(text(),'Update Article')]");

    By userDropdown = By.cssSelector(".nav-link.dropdown-toggle");
    By profileButton = By.xpath("//a[contains(@href,'#/profile')]");
    By articleLink = By.cssSelector(".preview-link");

    By articleContainer = By.cssSelector("div.article-meta");
    By editButton = By.xpath(".//a[contains(@href,'#/editor')]");
    By deleteButton = By.xpath(".//button[i[contains(@class,'ion-trash-a')]]");

    public void createArticle(String articleTitle){

        wait.until(ExpectedConditions.elementToBeClickable(newArticleBtn)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(title))
                .sendKeys(articleTitle);

        wait.until(ExpectedConditions.visibilityOfElementLocated(about))
                .sendKeys("Automation Testing");

        wait.until(ExpectedConditions.visibilityOfElementLocated(body))
                .sendKeys("Selenium Cucumber Article");

        wait.until(ExpectedConditions.elementToBeClickable(publish))
                .click();
    }

    public void updateArticle(String newTitle){
        wait.until(ExpectedConditions.elementToBeClickable(userDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(articleLink)).click();

        WebElement container = wait.until(
                ExpectedConditions.visibilityOfElementLocated(articleContainer)
        );

        container.findElement(editButton).click();

        WebElement titleField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(title)
        );

        titleField.clear();
        titleField.sendKeys(newTitle);

        wait.until(ExpectedConditions.elementToBeClickable(updateArticleBtn)).click();
    }

    public void deleteArticle(){
        wait.until(ExpectedConditions.elementToBeClickable(userDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(articleLink)).click();

        WebElement container = wait.until(
                ExpectedConditions.visibilityOfElementLocated(articleContainer)
        );

        container.findElement(deleteButton).click();
    }
}