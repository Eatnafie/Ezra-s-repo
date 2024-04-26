import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerStudentTest {
    
    @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("John", 25);
        assertEquals("John", customer.getName());
        assertEquals(25, customer.getAge());
    }
    
    @Test
    public void testCustomerCopyConstructor() {
        Customer originalCustomer = new Customer("Alice", 30);
        Customer copiedCustomer = new Customer(originalCustomer);
        assertEquals(originalCustomer.getName(), copiedCustomer.getName());
        assertEquals(originalCustomer.getAge(), copiedCustomer.getAge());
    }
    
    @Test
    public void testCustomerToString() {
        Customer customer = new Customer("Bob", 35);
        assertEquals("Customer: Bob, Age: 35", customer.toString());
    }
}