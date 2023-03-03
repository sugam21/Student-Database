package Student;
import java.util.*;
import java.io.*;
public class Input {
    Scanner scan = new Scanner(System.in);

    ArrayList<Student> list() {
        ArrayList<Student> listStudents = new ArrayList<Student>();
        System.out.print("Enter the number of students you want to add:=> ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("For " + (i+1) + " student");
            System.out.println("----------------------------");
            System.out.print("Enter the Name:=> ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Enter the PRN:=> ");
            long prn = scan.nextLong();
            System.out.print("Enter the Date Of Birth:=> ");
            scan.nextLine();
            String dob = scan.nextLine();
            System.out.print("Enter the Marks:=> ");
            int marks = scan.nextInt();
            Student s = new Student(name, prn, dob, marks);
            listStudents.add(i, s);
        }
        //listStudents will contains objects of student class with each student representing each index of arraylist.
        return listStudents;
    }
}
