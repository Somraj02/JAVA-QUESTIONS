import java.util.Scanner;

abstract class Student 
{
    protected int rollNo;
    protected int regNo;

    abstract void course();

    void getInput() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = in.nextInt();
        System.out.print("Enter Registration No: ");
        regNo = in.nextInt();
    }
}

class Kiitian extends Student 
{
    void course() 
    {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class lab501 
{
    public static void main(String[] args) 
    {
        Kiitian obj = new Kiitian();
        obj.getInput();
        System.out.println("Roll No - " + obj.rollNo);
        System.out.println("Registration No - " + obj.regNo);
        obj.course();
    }
}
