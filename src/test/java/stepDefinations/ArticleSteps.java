package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.ArticlePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class ArticleSteps {

    LoginPage login = new LoginPage();
    ArticlePage article = new ArticlePage();

    @Given("user logs into application")
    public void login(){
        login.login("sparshchaturvedi64@gmail.com","123456");
    }

    @When("user creates article {string}")
    public void createArticle(String title){
        article.createArticle(title);
    }

    @When("user updates article")
    public void updateArticle(DataTable table){
        List<Map<String,String>> data = table.asMaps(String.class,String.class);
        String title = data.get(0).get("title");
        article.updateArticle(title);
    }

    @When("user deletes article")
    public void deleteArticle(DataTable table){
        article.deleteArticle();
    }
}