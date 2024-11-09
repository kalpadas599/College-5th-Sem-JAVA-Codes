

// File: custDemo/mainpkg3/MainClass.java
package custDemo.mainpkg3;

import custDemo.cust.Customer;

public class MainClass {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer("Alice Smith", "123 Maple Street", "555-1234", 1001, true);

        // Display Customer details
        customer.display();
    }
}
