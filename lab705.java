public class lab705 {

    public static void main(String[] args) {
      if (args.length < 4) {
        throw new CheckArgumentException("Expected at least 4 arguments, but got " + args.length);
      }
  
      int sumOfSquares = 0;
      for (String arg : args) {
        try {
          int number = Integer.parseInt(arg);
          sumOfSquares += number * number;
        } catch (NumberFormatException e) {
          System.err.println("Invalid argument: " + arg);
        }
      }
  
      System.out.println("Sum of squares: " + sumOfSquares);
    }
  }
  
  class CheckArgumentException extends RuntimeException {
    public CheckArgumentException(String message) {
      super(message);
    }
  }
  