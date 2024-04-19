package org.example.tests;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class UITestItog extends BaseTest {

    @Test
    void testGBNotEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.enterLogin("login");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();

        Assertions.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Test
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.enterLogin("login@login.ru");
        loginPage.clickLoginButton();

        Assertions.assertTrue(loginPage.isErrorMessageDisplayedWithoutPassword());
    }
}