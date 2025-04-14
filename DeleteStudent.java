import java.util.*;

public class DeleteStudent {
    public static void delete(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.next();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getPrn().equals(prn)) {
                it.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
}

