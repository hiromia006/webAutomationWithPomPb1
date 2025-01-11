package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.AccountOpenedPage;
import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {

    @Test
    public void openNewAccountShouldSucceed() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        Assert.assertTrue(loginPage.hasLoginBtn());

        HomePage homePage = loginPage
                .doLogin(getUsername(), getPassword());
        Assert.assertTrue(homePage.hasLogoutLink());

        OpenNewAccountPage newAccountPage = homePage
                .clickOpenNewAccountLink()
                .selectAccountType(1);

        AccountOpenedPage openedPage = newAccountPage
                .clickOpenAccountBtn();
        Assert.assertTrue(openedPage.hasNewAccountNumber());


    }

    @Test
    public void openNewAccountShouldSucceed2() {
        AccountOpenedPage openedPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenNewAccountLink()
                .selectAccountType(1)
                .clickOpenAccountBtn();
        Assert.assertTrue(openedPage.hasNewAccountNumber());


    }
}
