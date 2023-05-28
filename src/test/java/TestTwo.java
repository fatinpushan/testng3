import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTwo {


    @Test
    public void test4(){
        System.out.println("19999");
    }


    @Test (dataProvider = "Provider", dataProviderClass = Dataproviderclass.class)
    public void test5(int x , String str, int zip){
        System.out.print(x + " ");
        System.out.print(str + " ");
        System.out.print(zip);
        System.out.println();
    }






}
