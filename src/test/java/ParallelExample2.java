import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ParallelExample2 {

    WebDriver chromeDriver;

    @BeforeTest
    public void setupDriver(){

        chromeDriver= new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test
    public void logoTest(){

        WebDriverWait webDriverWait= new WebDriverWait(chromeDriver, Duration.ofSeconds(10000));
        WebElement logo= webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");

    }

    @Test
    public void homePageTitleTest(){

        String pageTitle= chromeDriver.getTitle();
        Assert.assertEquals(pageTitle,"OrangeHRM","Page title is not matched");

    }

    @AfterTest
    public void tearDown(){
        chromeDriver.close();
    }

}
