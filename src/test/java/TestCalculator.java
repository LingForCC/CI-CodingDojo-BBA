import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test(expected = RuntimeException.class)
    public void notSupportedOperation() {
        calculator.calculate("abc", 6, 1);
    }

    @Test
    public void addition() {
        assertEquals(3, calculator.calculate("add", 2, 1));
    }

    @Test
    public void subsctraction() {
        assertEquals(1, calculator.calculate("substract", 2, 1));
    }

    @Test
    public void multiply() {
        assertEquals(6, calculator.calculate("multiply", 2, 3));
    }

    @Test
    public void divide() {
        assertEquals(2, calculator.calculate("divide", 6, 3));
    }

    @Test(expected = RuntimeException.class)
    public void divideByZero() {
        calculator.calculate("divide", 6, 0);
    }
}
