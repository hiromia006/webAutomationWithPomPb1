package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoanRequestProcessedPage extends BasePage{
    public LoanRequestProcessedPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasNewAccountNumber() {
        return geWebElements(By.id("newAccountId")).size() > 0;
    }
}
