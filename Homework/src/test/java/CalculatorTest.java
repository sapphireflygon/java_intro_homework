import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test // test addition functionality with small whole numbers
    public void canAddSingleDigitNumbersTogether(){
        int result = calculator.add(3,8);
        assertEquals(11, result);
    }

    @Test // test addition functionality with larger whole numbers
    public void canAddLargeNumbersTogether(){
        int result = calculator.add(3300080, 156380);
        assertEquals(3456460, result);
    }

    @Test // test subtraction with small whole numbers
    public void canSubtractSmallWholeNumbers(){
        int result = calculator.subtract(32, 10);
        assertEquals(22, result);
    }

    @Test // test subtraction with larger whole numbers
    public void canSubtractLargerWholeNumbers(){
        int result = calculator.subtract(87982735, 234876);
        assertEquals(87747859, result);
    }

    @Test // test multiplication with small whole numbers
    public void canMultiplySmallWholeNumbers(){
        int result = calculator.multiply(5, 9);
        assertEquals(45, result);
    }

    @Test // test multiplication with larger whole numbers
    public void canMultiplyLargerWholeNumbers(){
        int result = calculator.multiply(862, 23873);
        assertEquals(20578526, result);
    }

    @Test // test division with doubles
    public void canDivideSmallDoubles(){
        double result = calculator.divide(18.6, 3.1);
        assertEquals(6.0, result, 0.0);
    }
}
