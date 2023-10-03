import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleTest {
    // each function is a testcase
    Calculator calculator = new Calculator();

    @DataProvider(name = "Valid Division Data")
    public Object[][] dpMethod(){
        return  new Object[][]{
                { 10.0f, 5.0f, 2.0f},
                {-10.0f, 5.0f, -2.0f},
                {10.0f, -5.0f, -2.0f},
                {-10.0f, -5.0f, 2.0f},
                {0, 5.0f, 0},
                {0, -5.0f, 0},
        };
    }
    @DataProvider(name = "InValid Division Data")
    public Object[][] dpMethod2(){
        return  new Object[][]{
                { 10.0f, 0.0f},
        };
    }
    @Test(dataProvider = "Valid Division Data")
    public void testDivision(float x,float y, float expected){
        Assert.assertEquals(calculator.division(x,y),expected);
    }
    //when need to test if the code make exception
    @Test(dataProvider = "InValid Division Data", expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero(float x,float y){
        calculator.division(x,y);
    }


}
