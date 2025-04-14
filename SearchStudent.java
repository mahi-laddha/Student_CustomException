import java.util.*;

public class SearchStudent {
    public static void searchMenu(ArrayList<Student> students, Scanner sc) {
        System.out.println("1. Search by PRN");
        System.out.println("2. Search by Name");
        System.out.println("3. Search by Position");
        int opt = sc.nextInt();

        switch (opt) {
            case 1 -> searchByPRN(students, sc);
            case 2 -> searchByName(students, sc);
            case 3 -> searchByPosition(students, sc);
            default -> System.out.println("Invalid choice!");
        }
    }

    public static void searchByPRN(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void searchByName(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.next();
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) System.out.println("No student found with that name.");
    }

    public static void searchByPosition(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter Position (0-based index): ");
        int pos = sc.nextInt();
        try {
            System.out.println(students.get(pos));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Position out of range.");
        }
    }
}

