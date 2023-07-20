package rs.hristinastankovic;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Hooks {
    public static WebDriver driver=null;

    WebDriverWait webDriverWait;
    int maxRetries = 3;

    @BeforeClass
    public void beforeFunction(Scenario scenario) {
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
//
        Base.driver = new ChromeDriver(options);
    }

    @AfterClass
    public void afterFunction() {

    }

}