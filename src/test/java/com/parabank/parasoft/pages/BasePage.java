package com.parabank.parasoft.pages;

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
    public WebElement geWebElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("This locator " + locator + " is not found");
        }
        return element;
    }

    @Override
    public List<WebElement> geWebElements(By locator) {
        List<WebElement> elements = null;

        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            System.out.println("Those locators " + locator + " is not found");
        }
        return elements;
    }

    @Override
    public void clickElement(By locator) {
        geWebElement(locator).click();
    }

    @Override
    public void setWait(By locator) {
        wait.until(ExpectedConditions.visibilityOf(geWebElement(locator)));

    }

    @Override
    public String getText(By locator) {
        return geWebElement(locator).getText().trim();
    }
}
