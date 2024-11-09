

package collegeMgt.mainpkg1;
import collegeMgt.stu.Student;
import collegeMgt.emp.Faculty;
import collegeMgt.emp.Staff;

public class MainDemoClass {
    public static void main(String[] args) {
        // Create objects of each class and display their details
        Student student = new Student("Alice", 20, 101, "Computer Science");
        Faculty faculty = new Faculty("Dr. Smith", 45, 2001, "01-Jan-2010", "Professor");
        Staff staff = new Staff("John", 35, 3001, "15-Feb-2015", "Technical");

        System.out.println("Student Details:");
        student.display();

        System.out.println("\nFaculty Details:");
        faculty.display();

        System.out.println("\nStaff Details:");
        staff.display();
    }
}
