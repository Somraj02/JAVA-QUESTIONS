import java.util.Scanner;

public class lab205
{
 public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        arr2[0]=arr[0];
        for(int i = 0;i<n;i++)
        {
            int temp = arr[i];
            for(int j=0;j<n;j++)
            {
                if(temp==arr2[j])
                {
                
                }
            }
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:" +count);
    }
}