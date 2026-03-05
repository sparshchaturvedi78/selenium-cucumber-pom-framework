package pages;

import base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    By email = By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[text()='Login']");

    public void login(String user,String pass){

        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}