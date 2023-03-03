package Student;
import java.util.*;
import java.io.*;
public class Display {
    void show(ArrayList<Student> studentList)
    {
        int length = studentList.size();
        System.out.println("There are "+length+" students in database:");
        System.out.println("********************************************");
        System.out.println("********************************************");

        for(int i = 0 ; i < length ; i++)
        {
            System.out.println("Details of "+ (i+1) + " student");
            System.out.println("----------------------------------");
            System.out.print("Name => ");
            System.out.println(studentList.get(i).getName());
            System.out.print("PRN => ");
            System.out.println(studentList.get(i).getPrn());
            System.out.print("Dob => ");
            System.out.println(studentList.get(i).getDob());
            System.out.print("Marks => ");
            System.out.println(studentList.get(i).getMarks());

        }
    }
    void showSingleStudent(Student s)
    {
        System.out.println("Details of student");
        System.out.println("**************************");
        System.out.print("Name => ");
        System.out.println(s.getName());
        System.out.print("PRN => ");
        System.out.println(s.getPrn());
        System.out.print("Dob => ");
        System.out.println(s.getDob());
        System.out.print("Marks => ");
        System.out.println(s.getMarks());
    }
}
