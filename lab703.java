import java.util.Scanner;

class lab703 {
  public void ProcessInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    try {
      if (number < 0) 
      {
        throw new NegativeNumberException("Number should be positive");
      }
       else 
        {
        System.out.println("Double value: " + number * 2.0);
      }
    } 
    catch (NegativeNumberException e) {
      System.out.println("Caught the exception");
      System.out.println("Exception occurred: " + e.getMessage());
    }
  }

  public static void main(String[] args) 
  {
    lab703 processor = new lab703();
    processor.ProcessInput();
  }
}

class NegativeNumberException extends Exception 
{
  public NegativeNumberException(String message)
   {
    super(message);
  }
}
