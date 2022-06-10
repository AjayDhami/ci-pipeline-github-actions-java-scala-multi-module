import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathOperationsTest {

    @Test
    void addNumbers() {
        assertEquals(150, BasicMathOperations.addNumbers(100, 50));
    }

    @Test
    void subNumbers() {
        assertEquals(50, BasicMathOperations.subNumbers(100, 50));
    }

    @Test
    void multiplyNumbers() {
        assertEquals(5000, BasicMathOperations.multiplyNumbers(100, 50));
    }

}