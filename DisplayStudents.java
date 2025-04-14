import java.util.*;

public class DisplayStudents {
    public static void display(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

