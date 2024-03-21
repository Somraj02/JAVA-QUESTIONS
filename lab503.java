import java.util.Scanner;
interface Employee 
{
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

class Manager implements Employee 
{
    public double earnings(double basic) 
    {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    public double deductions(double basic) 
    {
        return 0.12 * basic;
    }

     public double bonus(double basic) 
    {
        throw new UnsupportedOperationException("Bonus not implemented for Manager");
    }
}

class Substaff extends Manager 
{
    
    public double bonus(double basic) 
    {
        return 0.5 * basic;
    }
}

public class lab503 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter basic salary for Substaff: ");
        double basicSalary = in.nextDouble();

        Substaff substaff = new Substaff();

        System.out.println("Earnings: " + substaff.earnings(basicSalary));
        System.out.println("Deductions: " + substaff.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}
