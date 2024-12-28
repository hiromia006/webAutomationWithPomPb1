package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private By btn = By.cssSelector("input[value='Register']");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasRegister() {
        return geWebElements(btn).size() > 0;
    }

    public RegisterPage clickRegisterBtn() {
        geWebElement(btn).click();
        return this;
    }

    public boolean hasAllFieldError() {
        return geWebElements(By.className("error")).size() == 8;
    }
}
