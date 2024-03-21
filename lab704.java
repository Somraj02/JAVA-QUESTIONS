import java.util.Scanner;

public class lab704 {
  private int hours;
  private int minutes;
  private int seconds;

  public void getTimeInput() throws HrsException, MinException, SecException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter hours: ");
    this.hours = scanner.nextInt();

    System.out.print("Enter minutes: ");
    this.minutes = scanner.nextInt();

    System.out.print("Enter seconds: ");
    this.seconds = scanner.nextInt();

    validateTime(hours, minutes, seconds);
  }

  private void validateTime(int hrs, int mins, int secs) throws HrsException, MinException, SecException {
    if (hrs < 0 || hrs > 24) {
      throw new HrsException("Invalid hour entered. Hour should be between 0 and 24");
    }
    if (mins < 0 || mins > 60) {
      throw new MinException("Invalid minute entered. Minute should be between 0 and 60");
    }
    if (secs < 0 || secs > 60) {
      throw new SecException("Invalid second entered. Second should be between 0 and 60");
    }
  }

  public static void main(String[] args) {
    lab704 time = new lab704();

    try {
      time.getTimeInput();
      System.out.println("Correct Time -> " + time.hours + ":" + time.minutes + ":" + time.seconds);
    } catch (HrsException | MinException | SecException e) {
      System.out.println("Exception occurred: " + e.getMessage());
    }
  }
}

class HrsException extends Exception {
  public HrsException(String message) {
    super(message);
  }
}

class MinException extends Exception {
  public MinException(String message) {
    super(message);
  }
}

class SecException extends Exception {
  public SecException(String message) {
    super(message);
  }
}
