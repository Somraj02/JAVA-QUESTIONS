import java.util.Scanner;

public class lab206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row in the matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of column in the matrix: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix Representation");
        for(int i=0;i< row;i++)
        {
            for(int j=0;j< col;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        int leftsum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            leftsum += arr[i][i];
        }
        int rightsum=0;
        for (int i = 0; i < n; i++) {
            rightsum += arr[i][n - 1 - i];

        }
          System.out.println("sum of the right diagonal elements: " +rightsum);
        System.out.println("Sum of the left diagonal elements: " + leftsum);
    }
}