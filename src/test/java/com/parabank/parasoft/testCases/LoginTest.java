package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginPage() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        Assert.assertTrue(loginPage.hasLoginBtn());
    }

    @Test
    public void doLoginShouldSucceed() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        loginPage = loginPage
                .fillUsername("sqa")
                .fillPassword("sqa");

        HomePage homePage = loginPage
                .clickLoginBtn();

        Assert.assertTrue(homePage.hasLogoutLink());
    }

    @Test
    public void logiShouldFailWithoutUsername() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        loginPage = loginPage
                .fillPassword("sqa")
                .clickLoginBtnForFail();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void logiShouldFailWithoutPassword() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        loginPage = loginPage
                .fillUsername("sqa")
                .clickLoginBtnForFail();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void logiShouldFailWithoutBoth() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        loginPage = loginPage
                .clickLoginBtnForFail();
        Assert.assertTrue(loginPage.hasError());
    }
}
