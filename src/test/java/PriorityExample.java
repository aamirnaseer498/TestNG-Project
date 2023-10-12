import org.testng.annotations.Test;

public class PriorityExample {

    @Test (priority = 1)
    public void testOne(){
        System.out.println("This is Test1");
    }

    @Test (priority =2)
    public void testTwo(){
        System.out.println("This is Test2");
    }

    @Test (priority = 3)
    public void testThree(){
        System.out.println("This is Test3");
    }

    @Test (priority = 4)
    public void testFour(){
        System.out.println("This is Test4");
    }

}
