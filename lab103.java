/*3. Aim of the program: Write a program to print the week day for the given day no. of
the current month using switch case statement

Input: Mention the Day no in the program
Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday
/Thursday/Friday/Saturday) */
import java.util.Scanner;
class lab103
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        int day;
        System.out.println("ENTER DATE (CURRENT MONTH :JAN)");
        day=input.nextInt();
        switch (day%7) 
        {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break; 
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                break;
        }
        input.close();
    }
}