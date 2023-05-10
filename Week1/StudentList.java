package Week1;

import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Prompt the user for number of students in class
        Student[] students = new Student[5];

        students[0] = new Student("001", "John");
        students[1] = new Student("002", "Mary");
        students[2] = new Student("003", "Peter");
        students[3] = new Student("004", "Susan");
        students[4] = new Student("005", "Bob");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getStudentID() + " " + students[i].getName());
        }

        // System.out.print("How many students are in your class? : ");

        // int numberOfStudents = input.nextInt(); //

        // Student[] students = new Student[numberOfStudents];

        // for (int i = 0; i < numberOfStudents; i++) {
        // System.out.println("Student " + (i + 1) + " details");
        // System.out.print("Enter student ID: ");
        // String studentID = input.next();
        // System.out.print("Enter student name: ");
        // String name = input.next();
        // students[i] = new Student(studentID, name);
        // }

        input.close();
    } // end main
}
