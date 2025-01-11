package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage extends BasePage {
    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountPage selectAccountType(int index) {
        new Select(getWebElement(By.id("type"))).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectAccountType(String value) {
        new Select(getWebElement(By.id("type"))).selectByValue(value);
        return this;
    }

    public AccountOpenedPage clickOpenAccountBtn() {
        clickElement(By.cssSelector("input[value='Open New Account']"));
        return getInstance(AccountOpenedPage.class);
    }
}
