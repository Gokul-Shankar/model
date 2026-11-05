
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCheckTest {

    NumberCheck obj = new NumberCheck();

    @Test
    public void testZero() {
        assertEquals("Zero",
                obj.checkNumber(0));
    }
}
