public class lab702 
{
    public static void main(String[] args) {
      int num1 = 10;
      int num2 = 0;
  
      try 
      {
        int result = num1 / num2;
        System.out.println("Result: " + result);
      } 
      catch (ArithmeticException e) 
      {
        System.out.println("Exception caught: Division by zero error");
        System.out.println(e.getMessage());
      }
      finally 
      {
        System.out.println("This is finally block and always executes");
      }
    }
  }
  