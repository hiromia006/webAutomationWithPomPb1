package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotLoginInfoPage extends BasePage {

    private By btn = By.cssSelector("input[value='Find My Login Info']");

    public ForgotLoginInfoPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasForgotLoginInfo() {
        return geWebElements(btn).size() > 0;
    }


}
