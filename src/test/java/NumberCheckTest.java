
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCheckTest {

    NumberCheck obj = new NumberCheck();

    @Test
    void testPositive() {
        assertEquals("Positive Number",
                obj.checkNumber(10));
    }

    @Test
    void testNegative() {
        assertEquals("Negative Number",
                obj.checkNumber(-5));
    }

    @Test
    void testZero() {
        assertEquals("Zero",
                obj.checkNumber(0));
    }
}
