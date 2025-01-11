package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage extends BasePage {
    private By loginBtn = By.cssSelector("input[value='Log In']");

    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    public CustomerLoginPage fillUsername(String username) {
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;

    }

    public CustomerLoginPage fillPassword(String password) {
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;

    }

    public HomePage clickLoginBtn() {
        getWebElement(loginBtn).click();
        return getInstance(HomePage.class);
    }

    public CustomerLoginPage clickLoginBtnForFail() {
        getWebElement(loginBtn).click();
        return this;
    }

    public boolean hasLoginBtn() {
        return geWebElements(loginBtn).size() > 0;
    }

    public boolean hasError() {
        return geWebElements(By.cssSelector(".error")).size() > 0;
    }

    public RegisterPage clickRegisterLink() {
        By reg = By.cssSelector("a[href='register.htm']");
        setWait(reg);
        getWebElement(reg).click();
        setWait(By.cssSelector("input[value='Register']"));
        return getInstance(RegisterPage.class);
    }

    public ForgotLoginInfoPage clickForgotLoginInfo() {
        getWebElement(By.cssSelector("a[href='lookup.htm']")).click();
        return getInstance(ForgotLoginInfoPage.class);
    }

    public HomePage doLogin(String username, String password) {
        return fillUsername(username)
                .fillPassword(password)
                .clickLoginBtn();
    }
}
