import java.util.Scanner;

class Subtractor {
    public void subtract(int a, int b) {
        int c = a - b;
        System.out.println("subtraction in int: " + c);
    }

    public void subtract(float a, float b) {
        float c = a - b;
        System.out.println("subtraction in float: " + c);
    }

    public void subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        System.out.println("subtraction in int array: " + result);
    }

    public void subtract(double a, double b) {
        double c = a - b;
        System.out.println("subtraction in double: " + c);
    }
}

public class lab304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        Subtractor subtractor = new Subtractor();
        subtractor.subtract(a, b);
        subtractor.subtract((float) a, (float) b);

        System.out.println("Enter the length of the number array: ");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        subtractor.subtract(numbers);

        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();
        System.out.println("Enter the value of d: ");
        double d = sc.nextDouble();
        subtractor.subtract(c, d);
    }
}