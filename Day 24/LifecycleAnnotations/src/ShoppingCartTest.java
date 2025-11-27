import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
        System.out.println("Setting up a new shopping cart for a test...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up shopping cart resources after test...");
    }

    @Test
    public void testAddItem() {
        cart.addItem("Laptop", 1000.0);
        cart.addItem("Mouse", 50.0);

        assertEquals(2, cart.getItemCount());
        assertEquals(1050.0, cart.getTotalPrice());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Laptop", 1000.0);
        cart.addItem("Mouse", 50.0);
        cart.addItem("Keyboard", 80.0);

        cart.removeItem("Mouse", 50.0);

        assertEquals(2, cart.getItemCount());
        assertEquals(1080.0, cart.getTotalPrice());
    }

    @Test
    public void testEmptyCartInitially() {
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }
}
