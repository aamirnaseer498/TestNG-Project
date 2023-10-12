import org.testng.annotations.Test;

public class GroupingExample {

    @Test (groups = {"smoke"})
    public void test1(){
        System.out.println("This is test1");
    }

    @Test (groups = {"sanity"})
    public void test2(){
        System.out.println("This is test2");
    }

    @Test (groups = {"sanity"})
    public void test3(){
        System.out.println("This is test3");
    }

    @Test (groups = {"regression"})
    public void test4(){
        System.out.println("This is test4");
    }

    @Test (groups = {"sanity","regression"})
    public void test5(){
        System.out.println("This is test5");
    }

}
