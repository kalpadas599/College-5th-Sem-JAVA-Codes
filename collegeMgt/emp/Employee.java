

package collegeMgt.emp;
import collegeMgt.per1.Person;

public class Employee extends Person {
    protected int empId;
    protected String doj;

    public Employee(String name, int age, int empId, String doj) {
        super(name, age);
        this.empId = empId;
        this.doj = doj;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Emp ID: " + empId);
        System.out.println("Date of Joining: " + doj);
    }
}
