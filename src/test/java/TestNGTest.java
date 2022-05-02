import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
    @Test(testName = "Add")
    public void testAdd() { Assert.assertEquals(5, TestNG.add(2,3));}

    @Test(testName = "Subtract")
    public void testSubtract() {
        Assert.assertEquals(2, TestNG.subtract(3,1));
    }

    @Test(testName = "Multiply")
    public void testMultiply() {
        Assert.assertEquals(10, TestNG.multiply(5,2));
    }

    @Test(testName = "Divide")
    public void testDivide() {
        Assert.assertEquals(10, TestNG.divide(100,10));
    }
}
