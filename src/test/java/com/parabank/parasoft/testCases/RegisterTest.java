package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void checkThatRegister() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        RegisterPage registerPage = loginPage
                .clickRegisterLink();
        Assert.assertTrue(registerPage.hasRegister());
    }
}
