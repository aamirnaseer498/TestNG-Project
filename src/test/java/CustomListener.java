import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Started all tests execution ..........");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finished all tests execution ..........");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Started test execution ..........");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped test execution ..........");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed ..........");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed ..........");
    }

}
