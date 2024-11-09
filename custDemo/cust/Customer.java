
// File: custDemo/cust/Customer.java
package custDemo.cust;

import custDemo.per2.Person;

public class Customer extends Person {
    private int customerNumber;
    private boolean onMailingList;

    // Constructor
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean onMailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    // Accessor and Mutator methods
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }

    // Display method (overrides Person's display)
    @Override
    public void display() {
        super.display();
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("On Mailing List: " + (onMailingList ? "Yes" : "No"));
    }
}
