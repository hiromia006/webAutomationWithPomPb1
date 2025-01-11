package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanPage extends BasePage {
    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }

    public RequestLoanPage fillLoanAmount(int amount){
        getWebElement(By.id("amount")).sendKeys(String.valueOf(amount));
        return this;
    }

    public RequestLoanPage fillDownPayment(int amount){
        getWebElement(By.id("downPayment")).sendKeys(String.valueOf(amount));
        return this;
    }

    public LoanRequestProcessedPage clickApplyNowBtn(){
        clickElement(By.cssSelector("input[value='Apply Now']"));
        return getInstance(LoanRequestProcessedPage.class);
    }

    //

    public ErrorPage clickApplyNowBtnForFail(){
        clickElement(By.cssSelector("input[value='Apply Now']"));
        return getInstance(ErrorPage.class);
    }
}
