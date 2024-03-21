/*5. Aim of the program : Write a program in Java to take first name and last name from
user and print both in one line as last name followed by first name

Input: Enter first name: KIIT
Enter Second Name: UNIVERSITY
Output: UNIVERSITY KIIT */
import java.util.Scanner;
class lab105
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first name :");
        String s1=input.next(); 
        System.out.print("Enter last name :");
        String s2=input.next();
        System.out.println("Output: "+(s2+" "+s1)); 
    }
}