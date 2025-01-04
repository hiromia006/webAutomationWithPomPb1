package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterTest extends BaseTest {
    @Test
    public void checkThatRegister() {
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        RegisterPage registerPage = loginPage
                .clickRegisterLink();
        Assert.assertTrue(registerPage.hasRegister());
    }

    @Test
    public void registerShouldSucceed() {
//        String username = LoremIpsum.getInstance().getTitle(2).replace(" ", "").trim();
        String username = "sqa"+ new Random().nextInt();
        String password = LoremIpsum.getInstance().getTitle(1);

        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);

        RegisterPage registerPage = loginPage
                .clickRegisterLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLasttName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(10))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateAbbr())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhone(LoremIpsum.getInstance().getPhone())
                .fillSsn(LoremIpsum.getInstance().getPhone())
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirm(password);

        HomePage homePage = registerPage
                .clickRegister();
        Assert.assertTrue(homePage.hasLogoutLink());

    }
}
