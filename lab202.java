/*2. Aim of the program : Accept 10 numbers from command line and check how many of
them are even and how many are odd. Input: Enter 10 number from keyboard
Output: Display number of even and odd number */
import java.util.Scanner;
class lab202
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int []num=new int[10];
        int i,c=0;
        System.out.println("Enter 10 numbers: ");
        for (i=0;i<10;i++)
        {
            num[i]=input.nextInt();
            if(num[i]%2==0)
            c++;
        }
        System.out.println("Number of even numbers"+c);
	    System.out.println("Number of odd numbers"+(10-c));

    }
}