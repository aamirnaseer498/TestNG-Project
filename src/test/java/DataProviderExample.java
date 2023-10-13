import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderExample {

    WebDriver webDriver;
    String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeMethod
    public void setupDriver() {

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);

    }

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getLoginData(){
        return new Object[][]{{"Admin","admin123"},{"Admin123","admin123"},{"Admin456","admin456"},{"Admin789","admin789"}};
    }

    @Test (dataProvider = "LoginDataProvider")
    public void loginTest(String userName, String password){

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10000));

        WebElement userNameElement= webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
        userNameElement.sendKeys(userName);
        WebElement passwordElement= webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
        passwordElement.sendKeys(password);
        WebElement loginElement= webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
        loginElement.click();

        System.out.println(webDriver.getCurrentUrl());
        Assert.assertTrue(webDriver.getCurrentUrl().contains("dashboard"),"Login Failed! your credentials might not be correct");

    }

    @AfterMethod
    public void tearDown() {
        webDriver.close();
    }

}
