import java.util.Scanner;
interface Employee {
    String getDetails();
  }
  
  interface Manager extends Employee {
    String getDeptDetails();
  }
  
  class Head implements Manager {
    private int empId;
    private String ename;
    private int deptId;
    private String deptName;
  
    public Head(int empId, String ename, int deptId, String deptName) {
      this.empId = empId;
      this.ename = ename;
      this.deptId = deptId;
      this.deptName = deptName;
    }
  
    @Override
    public String getDetails() {
      return "Employee id - " + empId + "\nEmployee name - " + ename;
    }
  
    @Override
    public String getDeptDetails() {
      return "Department id - " + deptId + "\nDepartment name - " + deptName;
    }
  
    public void printDetails() {
      System.out.println(getDetails());
      System.out.println(getDeptDetails());
    }
  }
  
  public class lab504
  {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Employee ID : ");
        int empId =in.nextInt();
        System.out.println("Employee Name :");
        String ename =in.next();
        System.out.println("Department ID : ");
        int deptId =in.nextInt();
        System.out.println("Department Name :");
        String deptName =in.next();
        Head head = new Head(empId, ename, deptId, deptName);
        head.printDetails();
    }
  }
  