import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {

    @Test
    public void startCar(){
        System.out.println("Car started");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"startCar"}, alwaysRun = true)
    public void driveCar(){
        System.out.println("Car driving");
    }

    @Test (dependsOnMethods = {"driveCar"})
    public void stopCar(){
        System.out.println("Car stopped");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"stopCar"})
    public void parkCar(){
        System.out.println("Car parked");
    }

}
