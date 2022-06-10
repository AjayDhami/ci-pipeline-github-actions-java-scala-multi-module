import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicMathOperationsIntegrationTest {

    @Test
    void addNumbers() {
        assertEquals(100, BasicMathOperations.addNumbers(50, 50));
    }

}
