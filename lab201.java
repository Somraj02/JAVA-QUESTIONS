/*1. Aim of the program : Find the largest among 3 user entered nos. at the command
prompt using Java
Input: Enter three number . Output: Display the Largest Number */
import java.util.Scanner;
class lab201
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter three numbers : ");
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
            System.out.println("Largest number is :"+n1);
        }
        else if(n2>n3)
        {
            if(n2>n1)
            System.out.println("Largest number is :"+n2);
        }
        else
        System.out.println("Largest number is:"+n3);
    }
}