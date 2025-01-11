package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferCompletePage extends BasePage {
    public TransferCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasTransferCompletedTittle() {
        return geWebElements(By.cssSelector("div[id='showResult'] h1[class='title']")).size() > 0;
    }
}
