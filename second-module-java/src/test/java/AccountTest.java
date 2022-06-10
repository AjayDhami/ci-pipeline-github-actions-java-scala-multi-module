import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void profit() {
        assertEquals(150, Account.profit(100, 50));
    }

    @Test
    void loss() {
        assertEquals(50, Account.loss(100, 50));
    }

    @Test
    void turnOver() {
        assertEquals(5000, Account.turnOver(100, 50));
    }
}