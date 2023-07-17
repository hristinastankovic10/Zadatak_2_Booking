package rs.hristinastankovic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class MySteps {
    @Given("Navigate to URL {string}")
    public void navigateToURL(String urlPath) throws InterruptedException {
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        Base.driver = new ChromeDriver(options);
        Base.driver.manage().window().maximize();
        Base.driver.navigate().to(urlPath);
        Thread.sleep(30000);
        //wait(1000);
    }

    @Then("Wait")
    public void wait1() throws InterruptedException {
        Thread.sleep(10000);

    }

    @Then("Scroll down to the element by text {string}")
    public void scrollDownToTheElementByText(String text) throws InterruptedException {
        //File file = new File("src/main/resources/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
        //ChromeOptions options = new ChromeOptions();
        //Base.driver = new ChromeDriver(options);
        WebElement element = Base.driver.findElement(By.xpath("//*[text()='" + text + "']"));
        ((JavascriptExecutor) Base.driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

    }

    @Then("Click on empty space")
    public void clickOnEmptySpace() throws InterruptedException {
        //File file = new File("src/main/resources/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
        //ChromeOptions options = new ChromeOptions();
        //Base.driver = new ChromeDriver(options);
        //Actions actions = new Actions(Base.driver);
        //wait(30000);
        //WebElement element = Base.driver.findElement(By.className("c334e6f658"));
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']"));
        element.click();
//        actions.moveToElement(Base.driver.findElement(By.tagName("body")),50,50 );
//        new Actions(Base.driver).moveByOffset(50,50).click().build().perform();

    }

    @Then("Assert 6 elements by id {string}")
    public void assertElementsByIdIndex(String id) {
        WebElement element = Base.driver.findElement(By.xpath("//*[@id=\":rb:\"][1]"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("Click on element right")
    public void clickOnElementRight() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@aria-label='Next'])[2]"));
        element.click();
    }

    @Then("Assert colour of elemnt {string} is {string}")
    public void assertColourOfElemntIs(String text, String color) {
        WebElement element = Base.driver.findElement(By.xpath("//*[text()='" + text + "']"));
        String value = element.getCssValue("color").toString();
        Assert.assertTrue(value.equals(color));
    }

    @Then("Type in {string} into search field by placeholder {string}")
    public void typeInIntoSearchField(String value, String placeholder) {
        WebElement element = Base.driver.findElement(By.xpath("//*[@placeholder='" + placeholder + "']"));
        element.sendKeys(value);

    }

    @Then("Browser quit")
    public void browserQuit() {
        Base.driver.quit();
    }

    @Then("Click on element on the dropdown list")
    public void clickOnElementOnTheDropdownList() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"f9afbb0024\"])[1]"));
        element.click();
    }

    @Then("Click on Button by class {string}")
    public void clickOnButtonById(String className) {
        //WebElement element = Global.driver.findElement(By.xpath("//*[@id=\":Ra9:\"][1]"));
        //WebElement element = Global.driver.findElement(By.className("e4b761c8b0"));
        //WebElement element = Global.driver.findElement(By.xpath("(//*[@class=\"a5761ae4af\"])[1]"));
        //WebElement element = Global.driver.findElement(By.xpath("(//*[@class=\"f9cf783bde\"])[1]"));
        //WebElement element = Global.driver.findElement(By.xpath("(//*[@class=\"cd1e09fdfe\"])[1]"));
        //WebElement element = Global.driver.findElement(By.xpath("(//*[class='"+text+"'])[1]"));
        //WebElement element = Global.driver.findElement(By.cssSelector("(//*[@class='"+text+"'])[1]"));
        //WebElement element = Global.driver.findElement(By.cssSelector("(//*[@class='"+className+"'])[1]"));
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class='" + className + "'])[1]"));
        element.click();
    }

    @Then("Click on start date")
    public void clickOnStartDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='29 July 2023']"));
        element.click();
    }

    @Then("Click on end date")
    public void clickOnEndDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='30 August 2023']"));
        element.click();
    }

    @Then("Click on Search button")
    public void clickOnSearchButton() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"f9cf783bde\"])[4]"));
        //WebElement element = Base.driver.findElement(By.className("fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 c938084447 f4605622ad aa11d0d5cd"));
        element.click();
    }

    @Then("Assert search results by class")
    public void assertSearchResults() {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='fcab3ed991 d5f78961c3']"));
        Assert.assertTrue(element.isDisplayed());
    }


    @Then("Click on upper option")
    public void clickOnUpperOption() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"a1b3f50dcd be36d14cea b2fe1a41c3 db7f07f643\"])[1]"));
        element.click();

    }

    @Then("Click on occupancy option")
    public void clickOnOccupancyOption() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@data-testid=\"occupancy-config\"]"));
        element.click();
    }

    @Then("Click on plus sign")
    public void clickOnPlusSign() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@type=\"button\"])[12]"));
        element.click();

    }

    @Then("Click on button Done")
    public void clickOnButtonDone() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@type=\"button\"])[18]"));
        element.click();
    }

    @Then("Click on language icon")
    public void clickOnLanguageIcon() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@type=\"button\"])[2]"));
        element.click();
    }

    @Then("Click on Close language selector")
    public void clickOnEnglishLanguageOption() {
        //WebElement element = Base.driver.findElement(By.cssSelector("[@class=\"cf67405157\"])[2]"));
        WebElement element = Base.driver.findElement(By.xpath("(//*[@aria-label=\"Close language selector\"][1]"));
        element.click();
    }

    @Then("Click on Flight option")
    public void clickOnStringOption() {
        //WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"db29ecfbe2\"]["+index+"])"));
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 fa030f4cc2 d4e373d880\"])[1]")));
        element.click();

    }

    @Then("Click on date field")
    public void clickOnInputField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[3]")));
        element.click();
    }

    @Then("Click on destination input field")
    public void clickOnDestinationInputField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[2]")));
        element.click();
    }

//    @Then("Input destination {string}")
//    public void inputDestination(String destination) {
//        WebElement element = Base.driver.findElement(By.cssSelector("[class='css-n1d439 css-18e6ulj']"));
//        element.sendKeys(destination);
//    }

    @Then("Click on Airport or City field and input {string}")
    public void clickOnAirportOrCityField(String value) {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='css-1ovag24']"));
        element.sendKeys(value);
        element.click();
    }

    @Then("Click on Submit button")
    public void clickOnSubmitButton() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@data-ui-name=\"button_search_submit\"]"));
        element.click();
    }


    @Then("Click on Attractions option")
    public void clickOnCarRentalsOption() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 fa030f4cc2 d4e373d880\"])[3]")));
        element.click();
    }

    @Then("Click on Select your dates field")
    public void clickOnSelectYourDatesField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-ck8kih\"])")));
        //WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"b6dc9a9e69 css-1udhgk3 e6c50852bd b8c9de5937\"])")));
        element.click();
    }

    @Then("Click on Search button by class")
    public void clickOnSearchButton1() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"e57ffa4eb5\"])[5]"));
        //WebElement element = Base.driver.findElement(By.xpath("//*[@class=\"fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 c334e6f658 f4605622ad css-1c2wgyo\"]"));
        //WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"f9cf783bde\"])[4]"));
        //WebElement element = Base.driver.findElement(By.className("fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 c938084447 f4605622ad aa11d0d5cd"));
        element.click();
    }
}