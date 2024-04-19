package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("https://gb.ru/login");
    }

    public void enterLogin(String login) {
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(login);
    }

    public void enterPassword(String password) {
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector(".btn.btn-block.btn-success")).click();
    }

    public boolean isErrorMessageDisplayed() {
        return !driver.findElements(By.cssSelector(".parsley-type")).isEmpty();
    }

    public boolean isErrorMessageDisplayedWithoutPassword() {
        return !driver.findElements(By.cssSelector(".parsley-required")).isEmpty();
    }
}

