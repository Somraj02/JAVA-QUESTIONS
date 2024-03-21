import java.util.Scanner;
class lab101
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name");
        String s=input.nextLine();
	System.out.println("You name is "+s);
        System.out.println("Your roll number");
        int a=input.nextInt();
        System.out.println("Your roll number is :"+a);
	System.out.println("Your Section :");
        String sec=input.next();
        System.out.println("Your section is :"+sec);
        System.out.println("Your branch :");
        String br=input.next();
        System.out.println("Your branch is :"+br);
        input.close();
    }
}