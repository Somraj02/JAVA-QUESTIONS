import java.util.*;

import Marketing.sales;
public class lab601
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 
        String ename = scanner.nextLine();

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        sales sales = new sales(empId, ename);

        double totalEarnings = sales.earnings(basicSalary);
        double travelAllowance = sales.travelAllowance(totalEarnings);

        System.out.println("The emp id of the employee is "+empId);
        System.out.println("The total earning is "+totalEarnings);
        System.out.println("The travel allowance is "+travelAllowance);
    }
}