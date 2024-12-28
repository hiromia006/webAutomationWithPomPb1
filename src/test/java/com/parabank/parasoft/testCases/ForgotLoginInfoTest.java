package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.ForgotLoginInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotLoginInfoTest extends BaseTest {
    @Test
    public void verifyForgotLoginInfoPage() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);

        ForgotLoginInfoPage forgotLoginInfo = loginPage.clickForgotLoginInfo();
        Assert.assertTrue(forgotLoginInfo.hasForgotLoginInfo());
    }
}
