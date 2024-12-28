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
}
