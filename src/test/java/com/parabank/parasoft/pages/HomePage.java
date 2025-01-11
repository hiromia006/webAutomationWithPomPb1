package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        return geWebElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
    }

    public OpenNewAccountPage clickOpenNewAccountLink() {
        clickElement(By.cssSelector("a[href='openaccount.htm']"));
        return getInstance(OpenNewAccountPage.class);
    }

    public RequestLoanPage clickRequestLoanLink() {
        clickElement(By.cssSelector("a[href='requestloan.htm']"));
        return getInstance(RequestLoanPage.class);
    }

    public TransferFundsPage clickTransferFunds() {
        clickElement(By.cssSelector("a[href='transfer.htm']"));
        return getInstance(TransferFundsPage.class);
    }
}
