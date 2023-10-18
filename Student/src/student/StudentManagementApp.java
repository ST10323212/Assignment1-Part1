/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Connor Grobler-pc (dont dox me)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {
    private final List<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // Menu display method
    public void displayMenu() {
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit.");
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new student");
        System.out.println("(2) Search for a student");
        System.out.println("(3) Delete a student");
        System.out.println("(4) Print Student Report");
        System.out.println("(5) Exit Application");
    }

    // Capture a new student
    public void captureStudent() {
        System.out.println("\nCAPTURE A NEW STUDENT");
        System.out.println("************************************");
        
        System.out.print("Enter the student id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        
        int age;
        do {
            System.out.print("Enter the student age (>= 16): ");
            age = scanner.nextInt();
        } while (age < 16);
        
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();
        
        Student student = new Student(id, name, age, email, course);
        students.add(student);
        
        System.out.println("Student details have been successfully saved.");
    }

    // Search for a student
    public void searchStudent() {
        System.out.print("\nEnter student ID to search: ");
        int searchId = scanner.nextInt();
        boolean found = false;
        
        for (Student student : students) {
            if (student.getId() == searchId) {
                displayStudentDetails(student);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Permamnetly erase a mortal that is classified as student
    public void deleteStudent() {
        System.out.print("\nEnter student ID to delete: ");
        int deleteId = scanner.nextInt();
        
        for (Student student : students) {
            if (student.getId() == deleteId) {
                displayStudentDetails(student);
                System.out.print("Confirm deletion (y/n): ");
                String confirmation = scanner.next().toLowerCase();
                if (confirmation.equals("y")) {
                    students.remove(student);
                    System.out.println("Student deleted.");
                }
                return;
            }
        }
        
        System.out.println("Student not found.");
    }

    // But what if you wanted a student report and i said no.... I guess i would be jobless and have 0, im sorry i will code now
    public void printStudentReport() {
        System.out.println("\nSTUDENT REPORT");
        System.out.println("************************************");
        
        int studentNumber = 1;
        for (Student student : students) {
            System.out.println("STUDENT " + studentNumber++);
            displayStudentDetails(student);
            System.out.println("************************************");
        }
    }

    // The funny little display 
    private void displayStudentDetails(Student student) {
        System.out.println("STUDENT ID: " + student.getId());
        System.out.println("STUDENT NAME: " + student.getName());
        System.out.println("STUDENT AGE: " + student.getAge());
        System.out.println("STUDENT COURSE: " + student.getCourse());
        System.out.println("STUDENT EMAIL: " + student.getEmail());
    }
// Main method UwU XDDDDD
    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            app.displayMenu();
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    app.captureStudent();
                    break;
                case '2':
                    app.searchStudent();
                    break;
                case '3':
                    app.deleteStudent();
                    break;
                case '4':
                    app.printStudentReport();
                    break;
                case '5':
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Im sorry but that was wrong. Exiting the application.");
                    break;
            }
        } while (choice != '5');
        
        scanner.close(); //(this should work)
    }
}

