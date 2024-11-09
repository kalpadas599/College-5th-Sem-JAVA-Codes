

package collegeMgt.stu;
import collegeMgt.per1.Person;

public class Student extends Person {
    private int rollNo;
    private String branch;

    public Student(String name, int age, int rollNo, String branch) {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}
