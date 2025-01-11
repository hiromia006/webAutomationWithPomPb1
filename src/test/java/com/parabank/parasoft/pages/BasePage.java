package com.parabank.parasoft.pages;

import com.aventstack.extentreports.Status;
import com.parabank.parasoft.report.ReportTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            addInfo("Selenium Webdriver going to find a WebElement with " + locator + " Locator");
            element = driver.findElement(locator);
            addInfo("Selenium Webdriver found a Web Element with " + locator + " Locator");
        } catch (Exception e) {
            addFailInfo("Selenium Webdriver is not found a Web Element with " + locator + " Locator");
            System.out.println("This locator " + locator + " is not found");
        }
        return element;
    }

    @Override
    public List<WebElement> geWebElements(By locator) {
        List<WebElement> elements = null;

        try {
            addInfo("Selenium Webdriver going to find  WebElements with " + locator + " Locator");
            elements = driver.findElements(locator);
        } catch (Exception e) {
            System.out.println("Those locators " + locator + " is not found");
        }
        return elements;
    }

    @Override
    public void clickElement(By locator) {
        addInfo("Click operation going on");
        getWebElement(locator).click();
    }

    @Override
    public void setWait(By locator) {
        addInfo("Set Wait for Web Element visibility");
        wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));

    }

    @Override
    public String getText(By locator) {
        return getWebElement(locator).getText().trim();
    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }

    public void addFailInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.FAIL, message);
        }
    }
}
