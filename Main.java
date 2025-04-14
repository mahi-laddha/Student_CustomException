import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Data Entry Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> AddStudent.addStudent(students, sc);
                case 2 -> DisplayStudents.display(students);
                case 3 -> SearchStudent.searchMenu(students, sc);
                case 4 -> UpdateStudent.update(students, sc);
                case 5 -> DeleteStudent.delete(students, sc);
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
