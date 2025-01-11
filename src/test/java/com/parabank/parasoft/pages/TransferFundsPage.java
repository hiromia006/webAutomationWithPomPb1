package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage extends BasePage {
    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage fillAmount(int amount) {
        getWebElement(By.id("amount")).sendKeys(String.valueOf(amount));
        return this;
    }

    public TransferFundsPage selectFromAccountId(int index) {
        new Select(getWebElement(By.id("fromAccountId"))).selectByIndex(index);
        return this;
    }

    public TransferCompletePage clickTransferBtn() {
        clickElement(By.cssSelector("input[value='Transfer']"));
       return getInstance(TransferCompletePage.class);
    }
}
