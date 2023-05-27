import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {



    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }


    @Test


    public void testone() {
        System.out.println("Test one");
    }





    @Test
    public void testTwo(){
        System.out.println("Test two");
    }


    @Test
    public void testThree(){
        System.out.println("Test three");
    }



}
