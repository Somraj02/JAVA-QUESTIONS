/*3. Aim of the program : Write a program in java to input and display the details of n
number of students having roll, name and cgpa as data members. Also display the
name of the student having lowest cgpa. Input: Enter Roll No, Name and cgpa of ‘n’ number of students. Output: Display the details of ‘n’ number of students. Also display the
name of student with lowest cgpa */
import java.util.*;

class Student {
    int roll;
    String name;
    double cgpa;

    public void setStudentDetails(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void displayDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
}

public class lab303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            arr[i] = new Student();
            arr[i].setStudentDetails(roll, name, cgpa);
        }

        System.out.println("Details of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------");
            arr[i].displayDetails();
        }

        Student studentWithLowestCGPA = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].cgpa < studentWithLowestCGPA.cgpa) {
                studentWithLowestCGPA = arr[i];
            }
        }

        System.out.println("Student with the lowest CGPA:");
        System.out.println("---------------------------");
        studentWithLowestCGPA.displayDetails();
    }
}