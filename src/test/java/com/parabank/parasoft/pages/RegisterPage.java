package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private By btn = By.cssSelector("input[value='Register']");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasRegister() {
        return geWebElements(btn).size() > 0;
    }

    public RegisterPage clickRegisterBtn() {
        geWebElement(btn).click();
        return this;
    }

    public boolean hasAllFieldError() {
        return geWebElements(By.className("error")).size() == 8;
    }

    public RegisterPage fillFirstName(String firstName) {
        ParaBankUtil.waitForDomStable();
        geWebElement(By.id("customer.firstName")).sendKeys(firstName);
        return this;
    }

    public RegisterPage fillLasttName(String lastName) {
        geWebElement(By.id("customer.lastName")).sendKeys(lastName);
        return this;
    }

    public RegisterPage fillAddress(String address) {
        geWebElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }

    public RegisterPage fillCity(String city) {
        geWebElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }

    public RegisterPage fillState(String state) {
        geWebElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }

    public RegisterPage fillZipCode(String zipCode) {
        geWebElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        return this;
    }

    public RegisterPage fillPhone(String phone) {
        geWebElement(By.id("customer.phoneNumber")).sendKeys(phone);
        return this;
    }

    public RegisterPage fillSsn(String ssn) {
        geWebElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }

    public RegisterPage fillUsername(String username) {
        ParaBankUtil.waitForDomStable();
        geWebElement(By.id("customer.username")).sendKeys(username);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        ParaBankUtil.waitForDomStable();
        geWebElement(By.id("customer.password")).sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirm(String confirm) {
        ParaBankUtil.waitForDomStable();
        geWebElement(By.id("repeatedPassword")).sendKeys(confirm);
        return this;
    }

    public HomePage clickRegister() {
        ParaBankUtil.waitForDomStable();
        clickElement(btn);
        return getInstance(HomePage.class);
    }
}
