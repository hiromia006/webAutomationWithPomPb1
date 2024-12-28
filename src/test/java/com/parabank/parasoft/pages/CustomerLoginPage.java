package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage extends BasePage {
    private By loginBtn = By.cssSelector("input[value='Log In']");

    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    public CustomerLoginPage fillUsername(String username) {
        geWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;

    }

    public CustomerLoginPage fillPassword(String password) {
        geWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;

    }

    public HomePage clickLoginBtn() {
        geWebElement(loginBtn).click();
        return getInstance(HomePage.class);
    }

    public boolean hasLoginBtn() {
        return geWebElements(loginBtn).size() > 0;
    }

    public RegisterPage clickRegisterLink() {
        By reg=By.cssSelector("a[href='register.htm']");
        setWait(reg);
        geWebElement(reg).click();
        setWait(By.cssSelector("input[value='Register']"));
        return getInstance(RegisterPage.class);
    }

    public ForgotLoginInfoPage clickForgotLoginInfo() {
        geWebElement(By.cssSelector("a[href='lookup.htm']")).click();
        return getInstance(ForgotLoginInfoPage.class);
    }
}
