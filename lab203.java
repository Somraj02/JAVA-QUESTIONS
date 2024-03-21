/*3. Aim of the program: Program to sort the user entered list of numbers of any size

Input: List of Numbers
Output: Display the numbers in Ascending order */
import java.util.Scanner;
class lab203
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int []num=new int[10];
        int i,j,min,temp;
        System.out.println("Enter 10 numbers: ");
        for (i=0;i<10;i++)
        {
            num[i]=input.nextInt();
        }
        for (i=0;i<10-1;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(num[j]<num[min])
                min=j;
            }
            temp=num[i];
            num[i]=num[min];
            num[min]=temp;
        }
        System.out.println("SORTED ARRAY :");
        for(i=0;i<10;i++)
        System.out.println(+num[i]);
    }
}  