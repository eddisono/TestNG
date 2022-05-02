import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
    @Test()
    public void Add() {
        Assert.assertEquals(5, TestNG.add(2,3));
    }

    @Test()
    public void Subtract() {
        Assert.assertEquals(2, TestNG.subtract(3,1));
    }

    @Test()
    public void Multiply() {
        Assert.assertEquals(10, TestNG.multiply(5,2));
    }

    @Test()
    public void Divide() {
        Assert.assertEquals(10, TestNG.divide(100,10));
    }
}
