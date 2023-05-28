import org.testng.annotations.DataProvider;

public class Dataproviderclass {


    @DataProvider(name = "Provider")

    public static Object[][] data(){
        Object[][] data = new Object[4][3] ;

        data[0][0] = 8 ;
        data[0][1] = "John" ;
        data[0][2] = 11705 ;

        data[1][0] = 10 ;
        data[1][1] = "ifc" ;
        data[1][2] = 11208 ;

        data[2][0] = 50 ;
        data[2][1] = "kfc" ;
        data[2][2] = 11706 ;

        data[3][0] = 70 ;
        data[3][1] = "abc" ;
        data[3][2] = 11717 ;

        return data ;


    }
}
