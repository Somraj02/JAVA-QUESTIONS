public class lab701 {

    public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4};
  
      try 
      {
        System.out.println(numbers[4]);
      } 
      catch (ArrayIndexOutOfBoundsException e) 
      {
        System.out.println("Exception: " + e.getMessage());
      }
    }
  }
  