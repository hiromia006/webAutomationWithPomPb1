package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.ErrorPage;
import com.parabank.parasoft.pages.LoanRequestProcessedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestLoanTest extends BaseTest {

    @Test
    public void requestLoanShouldSucceed() {
        LoanRequestProcessedPage processedPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickRequestLoanLink()
                .fillLoanAmount(2000)
                .fillDownPayment(20)
                .clickApplyNowBtn();
        Assert.assertTrue(processedPage.hasNewAccountNumber());
    }

    @Test
    public void requestLoanFail() {
        ErrorPage erPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickRequestLoanLink()
                .clickApplyNowBtnForFail();

        Assert.assertTrue(erPage.hasError());
    }
}
