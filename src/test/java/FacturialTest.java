import org.example.Facturial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacturialTest {

   @DataProvider(name="Test Factorial")
    public Object[][] dpMethod() {
        return new Object [][] {
                {5,120},
                {0,1},


        };
    }

    @Test(dataProvider ="Test Factorial")
    public  void testFactorial(int number, int expected){
       Facturial facturial= new Facturial();
        Assert.assertEquals(facturial.getFuctorial(number), expected );
    }



}
