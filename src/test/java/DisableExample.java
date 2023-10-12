import org.testng.annotations.Test;

public class DisableExample {

    @Test
    public void testOne(){
        System.out.println("This is Test1");
    }

    @Test (enabled = false)
    public void testTwo(){
        System.out.println("This is Test2");
    }

    @Test (enabled = false)
    public void testThree(){
        System.out.println("This is Test3");
    }

    @Test
    public void testFour(){
        System.out.println("This is Test4");
    }

}
