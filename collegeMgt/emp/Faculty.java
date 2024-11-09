

package collegeMgt.emp;

public class Faculty extends Employee {
    private String designation;

    public Faculty(String name, int age, int empId, String doj, String designation) {
        super(name, age, empId, doj);
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}
