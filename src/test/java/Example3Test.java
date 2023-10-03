import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class Example3Test {

    // before any test in class execute this code
    @BeforeClass
    public  void printStatusClass() {
        System.out.println("class is started");
    }
    // after execute all test cases in class execute this code
    @AfterClass
    public  void printStatusClass2() {
        System.out.println("class is finished");
    }
    // before every method execute this code
    // ITestResult use to access for test method
    @BeforeMethod
    public  void printStatus2(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"is starting");

    }

    // It's execute after each method
    @AfterMethod
    public  void printStatus(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"is finishing");

    }



    // if don't add priority parameter, it put the default value that equals=0
    // then execute all test that don't have priority, by alphabetic
    @Test(priority = 1)
    public void testDivision1(){
        System.out.println("testDivision1");
        Assert.assertTrue(5==5);
    }

    @Test(priority = 2)
    public void testDivision2(){
        System.out.println("testDivision2");
        Assert.assertTrue(5==5);
    }
    @Test(priority = 0)
    public void testDivision3(){
        System.out.println("testDivision3");
        Assert.assertTrue(5==5);
    }
    @Test(priority =3)
    public void testDivision4(){
        System.out.println("testDivision4");
        Assert.assertTrue(5==5);
    }
    @Test
    public void testDivision5(){
        System.out.println("testDivision5");
        Assert.assertTrue(5==5);
    }

}
