import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {



    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }


    @Test (priority = 0)


    public void testone() {
        System.out.println("Test one");
    }





    @Test (priority = 1)
    public void testTwo(){
        System.out.println("Test two");
    }


    @Test (dataProvider = "provider")
    public void testThree(int ssn, String name){
        System.out.println("SSN is " + ssn);
        System.out.println("Na is" + name);
    }


    @DataProvider (name = "provider")
    public Object[][] dataProvider(){
        Object[][] data = new Object[2][2];
        data[0][0] = 123 ;
        data[0][1] = "kasif" ;
        data[1][0] = 236 ;
        data[1][1] = "Asma" ;

        return data ;

    }



}
