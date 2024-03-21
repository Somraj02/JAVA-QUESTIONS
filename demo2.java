import java.util.Scanner;
class demo2
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your name");
        String s=input.nextLine();
        System.out.println("You name is"+s);
        System.out.println("Your roll number");
        int a=input.nextInt();
        System.out.println("Your roll number is :"+a);
        System.out.println("Enter value of Pi in decimal:");
        float b=input.nextFloat();
        System.out.println("The value of Pi in decimmal is :"+b);
        input.close();
    }
}