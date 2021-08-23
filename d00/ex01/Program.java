import java.util.Scanner;

public class Program {

  private static int comparisonCounter = 0;


  private static boolean isPrime(int input) {
    boolean isPrime = true;
    int divider = 2;

    while (true) {
      ++comparisonCounter;

      if (input % divider == 0) {
        isPrime = false;
        break;
      }

      if (divider * divider > input) {
        break;
      }

      divider++;
    }
    return isPrime;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if (input < 2) {
      System.err.println("IllegalArgument");
      System.exit(-1);
    }

    System.out.println((isPrime(input) ? "true " : "false ") + comparisonCounter);    
  }
}
