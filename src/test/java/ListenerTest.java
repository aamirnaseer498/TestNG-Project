import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerTest {

    @Test
    public void test1(){
        System.out.println("This is Test1");
        Assert.assertTrue(true);
        System.out.println("Test is passed");
    }

    @Test
    public void test2(){
        System.out.println("This is Test2");
        Assert.assertFalse(true,"Test is failed");
    }

    @Test
    public void test3(){
        System.out.println("This is Test3");
        throw new SkipException("Test is skipped");
    }

}
