package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorPage extends BasePage {
    public ErrorPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasError() {
        return geWebElements(By.cssSelector("div[id='requestLoanError'] p[class='error']")).size() > 0;
    }
}
