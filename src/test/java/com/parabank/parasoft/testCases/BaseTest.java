package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    Page page;
    private Properties properties;

    public BaseTest() {
        properties = new Properties();
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
        try {
            FileInputStream inputStream=new FileInputStream(path);
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeMethod
    public void setUp() {
        String browserName = properties.getProperty("browserName");

        switch (browserName) {
            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "headless":
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--headless");
                driver = new FirefoxDriver(options);

            default:
                System.out.println("Please provide correct browser name");
                break;

        }

        driver.manage().window().maximize();
        driver.get(properties.getProperty("baseUrl"));

        page = new BasePage(driver);


    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    public String getUsername(){
        return properties.getProperty("username");
    }

    public String getPassword(){
        return properties.getProperty("password");
    }


    public  WebDriver getWebDriver() {
        return driver;
    }
}
