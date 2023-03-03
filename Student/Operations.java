package Student;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
public class Operations {
    Input i = new Input(); //Creating instance of Input class
    Scanner scan = new Scanner(System.in);


    ArrayList<Student> add(ArrayList<Student> studentList) {
        System.out.println("Here you can add a new student");
        long prn;
        String name;
        String dob;
        int marks;
        System.out.print("Enter the Name of Student: ");
//        scan.nextLine();
        name = scan.nextLine();
        System.out.print("Enter the PRN of Student: ");
        prn = scan.nextLong();
        System.out.print("Enter the DOB of Student: ");
        scan.nextLine();
        dob = scan.nextLine();
        System.out.print("Enter the marks of Student: ");
        marks = scan.nextInt();

        Student s2 = new Student(name, prn, dob, marks);
        studentList.add(s2);
        return studentList;
    }

    void search(ArrayList<Student> studentList) {
        long prn;
        String name;
        System.out.print("Enter the name of student you want to search => ");
        scan.nextLine();
        name = scan.nextLine();
        System.out.print("Enter the prn you want to search => ");
        prn = scan.nextLong();


        int flag = 0;
        int length = studentList.size();
        for (int i = 0; i < length; i++) {
            if ((studentList.get(i).getPrn() == prn) || (studentList.get(i).getName().equals(name)))
            {
                System.out.println("Student Found");
                System.out.println("***********************");
                System.out.print("Name => ");
                System.out.println(studentList.get(i).getName());
                System.out.print("PRN => ");
                System.out.println(studentList.get(i).getPrn());
                System.out.print("Dob => ");
                System.out.println(studentList.get(i).getDob());
                System.out.print("Marks => ");
                System.out.println(studentList.get(i).getMarks());
                flag = 1;
            }
            else
            {
                continue;
            }
        }
        if (flag == 0) {
            System.out.println("No Student found with Prn " + prn);
        }

    }

    ArrayList<Student> update(ArrayList<Student> studentList) {
        int choice;
        int length = studentList.size();
        Display d = new Display();
        long prn;
        System.out.println("Enter the prn you want to update => ");
        prn = scan.nextLong();
        int flag = 0;
        for (int i = 0; i < length; i++) {


            if (studentList.get(i).getPrn() == prn) {
                Student s = studentList.get(i); // Storing that student in a variable
                System.out.println("Student Found !!!!!!");
                System.out.println("----------------------");
                d.showSingleStudent(studentList.get(i));
                System.out.println("What do you want to update ? ");
                System.out.println("*******************************");
                System.out.println("1. Name ");
                System.out.println("2. PRN ");
                System.out.println("3. Dob ");
                System.out.println("4. Marks ");
                System.out.println("*******************************");
                System.out.print("Enter your choice => ");
                choice = scan.nextInt();
                if (choice == 1) {
                    String name;
                    System.out.print("Enter the new name => ");
                    scan.nextLine();
                    name = scan.nextLine();
                    s.setName(name);
                } else if (choice == 2) {
                    long prn2;
                    System.out.print("Enter the new prn => ");
                    prn2 = scan.nextLong();
                    s.setPrn(prn2);

                } else if (choice == 3) {
                    String dob;
                    System.out.print("Enter the new dob => ");
                    scan.nextLine();
                    dob = scan.nextLine();
                    s.setDob(dob);
                } else if (choice == 4) {
                    int marks;
                    System.out.print("Enter the new marks => ");
                    marks = scan.nextInt();
                    s.setMarks(marks);
                } else {
                    System.out.println("Error in choice!!!!1");
                }

                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Student Not found");
        }

        return studentList;
    }

    ArrayList<Student> delete(ArrayList<Student> studentList) {
        int length = studentList.size();
        Display d = new Display();
        int choice;
        long prn;
        System.out.println("Enter the prn you want to remove => ");
        prn = scan.nextLong();
        int flag = 0;
        for (int i = 0; i < length; i++)
        {
            if (studentList.get(i).getPrn() == prn) {
                Student s = studentList.get(i);

                d.showSingleStudent(studentList.get(i)); // For displaying the result of single student
                System.out.println("Do you really wanna delete: (1 -> YES / 0 -> NO)");
                choice = scan.nextInt();
                if (choice == 1) {
                    studentList.remove(i);
                } else {
                    break;
                }
            }

        }
        return studentList;
    }
}
