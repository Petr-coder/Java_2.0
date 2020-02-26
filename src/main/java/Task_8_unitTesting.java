import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Task_8_unitTesting {
    Task_5_Calculator_OOP calculator = new Task_5_Calculator_OOP();


    @Test
    public void testSum() throws Exception{
        double result = calculator.add(2, 2);
        if (result != 4) {
            Assert.fail();
        }
    }


    @Test
    public void testSubtract() throws Exception{
        double result = calculator.sub(2, 2);
        if (result != 0) {
            Assert.fail();
        }
    }

    @Test
    public void testMultiply() throws Exception{
        double result = calculator.mul(-2, 1.9);
        if (result != -3.8) {
            Assert.fail();
        }
    }

    @Test
    public void testDivide() throws Exception{
        double result = calculator.div(320, 2);
        if (result != 160) {
            Assert.fail();
        }
    }
}