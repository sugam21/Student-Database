// Name: Sugam Sharma
// PRN : 21070126129
// Batch: AIML(B-3)


package Student;
import java.util.*;
import java.io.*;
public class Student {
    private String name;
    private long prn;
    private String dob;
    private int marks;

    public Student(String name, long prn, String dob, int marks) {
        this.name = name;
        this.prn = prn;
        this.dob = dob;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public long getPrn() {
        return prn;
    }

    public String getDob() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrn(long prn) {
        this.prn = prn;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args)
    {
        Input i = new Input();
        Operations o = new Operations();
        Display d = new Display();
        ArrayList<Student> l = new ArrayList<Student>();

        Scanner scan = new Scanner(System.in);
        int inputChoice;
        int exitChoice;


        while(true)
        {
            System.out.flush();
            System.out.print("\033[H\033[2J");
            System.out.println("_______________________________________________________________");
            System.out.println("|This is a menu driven code for Student management system     |");
            System.out.println("|_____________________________________________________________|");
            System.out.println("|               1. Create a Database                          |");
            System.out.println("|               2. Display the Database                       |");
            System.out.println("|               3. Add a new Student                          |");
            System.out.println("|               4. Search a Student                           |");
            System.out.println("|               5. Update a Student                           |");
            System.out.println("|               6. Delete a Student                           |");
            System.out.println("|_____________________________________________________________|");
            System.out.print("Enter your Choice: => ");
            inputChoice = scan.nextInt();
            switch (inputChoice){
                case 1:
                l = i.list();
                    break;
                case 2: d.show(l);
                    break;
                case 3:
                    l = o.add(l);
                    break;
                case 4:
                    o.search(l);
                    break;
                case 5:
                    l = o.update(l);
                    break;
                case 6:
                    l = o.delete(l);
                    break;
                default: System.out.println("You entered wrong choice. Please repeat !!");
                    break;
            }
            System.out.println("Do you want to continue ? | 1 => YES , 0 => NO");
            exitChoice = scan.nextInt();
            if(exitChoice != 1 )
            {
                break;
            }

        }


    }
}
