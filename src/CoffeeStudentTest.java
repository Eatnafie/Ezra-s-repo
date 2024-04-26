
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeStudentTest {
    private Coffee coffee;

    @Before
    public void setUp() {
        coffee = new Coffee("Latte", Size.MEDIUM, true, false);
    }

    @After
    public void tearDown() {
        coffee = null;
    }

    @Test
    public void testCalcPrice() {
        // Calculate the expected price manually
        double expectedPrice = 2.0 + 0.5 + 0.0; // Base price + size price (medium) + extra shot

        // Assert that the calculated price matches the expected price
        assertEquals(expectedPrice, coffee.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        // Expected string representation
        String expectedString = "Latte, Size: MEDIUM, Extra Shot: true, Extra Syrup: false, Price: $2.5";

        // Assert that the string representation matches the expected string
        assertEquals(expectedString, coffee.toString());
    }

    @Test
    public void testEquals() {
        // Create another Coffee object with the same attributes
        Coffee anotherCoffee = new Coffee("Latte", Size.MEDIUM, true, false);

        // Assert that the two Coffee objects are equal
        assertEquals(coffee, anotherCoffee);

        // Change one attribute of the other Coffee object
        anotherCoffee.setExtraSyrup(true);

        // Assert that the two Coffee objects are not equal anymore
        assertNotEquals(coffee, anotherCoffee);
    }

    @Test
    public void testGettersAndSetters() {
        // Test getters
        assertEquals("Latte", coffee.getName());
        assertEquals(Size.MEDIUM, coffee.getSize());
        assertTrue(coffee.isExtraShot());
        assertFalse(coffee.isExtraSyrup());

        // Test setters
        coffee.setName("Cappuccino");
        coffee.setSize(Size.LARGE);
        coffee.setExtraShot(false);
        coffee.setExtraSyrup(true);

        assertEquals("Cappuccino", coffee.getName());
        assertEquals(Size.LARGE, coffee.getSize());
        assertFalse(coffee.isExtraShot());
        assertTrue(coffee.isExtraSyrup());
    }
}