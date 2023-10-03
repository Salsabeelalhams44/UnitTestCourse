import org.example.TextLength;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextLengthTest {
    @DataProvider(name="Test Text length")
    public Object[][] dpMethod() {
        return new Object [][] {
                {"Salsabeel",9 },
                {"Mais", 4},
                {" Mais",4},
                {"Mais ",4 },
                {" Mais ", 4},
                {"Mais Mais", 9}

        };
    }

    @Test(dataProvider ="Test Text length")
    public  void testTextLength(String text, int expected){
        TextLength textLength = new TextLength();
        Assert.assertEquals(textLength.getTextLength(text), expected );
    }
}
