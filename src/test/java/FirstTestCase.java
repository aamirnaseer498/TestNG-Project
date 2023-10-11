import org.testng.annotations.*;

public class FirstTestCase {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after test method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after test");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("This will execute before suite");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("This will execute after suite");
    }

    @Test (priority = 1)
    public void setup(){
        System.out.println("Opening browser");
    }

    @Test (priority = 2)
    public void login(){
        System.out.println("This is login test");
    }

    @Test (priority = 3)
    public void teardown(){
        System.out.println("Closing browser");
    }

}
