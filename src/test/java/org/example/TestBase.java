package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeClass
    public void beforeAllTests() {
        String flag = System.getProperty("browser");
        if ("firefox".equalsIgnoreCase(flag)) {
            Configuration.browser = "firefox";
        }else{
            Configuration.browser = "chrome";
        }

        Configuration.reportsFolder = "test-result/reports";

    }
    @BeforeMethod
    public void beforeTest() {
        open("https://the-internet.herokuapp.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            WebDriverRunner.getWebDriver().quit();
        }
    }
}
