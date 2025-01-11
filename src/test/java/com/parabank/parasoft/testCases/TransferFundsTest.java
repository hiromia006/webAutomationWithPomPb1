package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.TransferCompletePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest {
    @Test
    public void transferFundsShouldSucceed() {
        TransferCompletePage completePage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickTransferFunds()
                .fillAmount(50)
                .selectFromAccountId(1)
                .clickTransferBtn();
        Assert.assertTrue(completePage.hasTransferCompletedTittle());
    }
}
