/*4. Aim of the program : Program to check a user entered number is palindrome or not
Input: Mention the number in the program
Output: display the number is Palindrome or not. */
import java.util.Scanner;
class lab104
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=input.nextInt();
        int temp=num;
        int s=0,r;
        while(num!=0)
        {
            r=num%10;
            s=s*10+r;
            num=num/10;
        }
        if(temp==s)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a Palindrome Number");

    }
}