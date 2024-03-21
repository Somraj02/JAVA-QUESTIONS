/*2. Aim of the program: Write a program to print the corresponding grade for the
given mark using if..else statement in Java
Input: Mention the grade in the program
Output: Display the Grade either O/E/A/B/C */
import java.util.Scanner;
class lab102
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int m =input.nextInt();
        if(m>=90 && m <=100 )
        System.out.println("GRADE : O");
        else if(m>=80 && m <=89)
        System.out.println("GRADE : E");
        else if(m>=70 && m <=79)
        System.out.println("GRADE : A");
        else if(m>=60 && m <=69)
        System.out.println("GRADE : B");
        else if(m>=50 && m <=59)
        System.out.println("GRADE : C");
        else if(m>=40 && m <=49)
        System.out.println("GRADE : D");
        else
        System.out.println("GRADE : F");
        input.close();
    }
}