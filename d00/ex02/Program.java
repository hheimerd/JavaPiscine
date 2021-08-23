import java.util.Scanner;

public class Program {

  private static boolean isPrime(int input) {
    boolean isPrime = true;
    int divider = 2;

    while (true) {
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

  private static int getDigitSum(int number) {
    int digitsSum = 0;

    while (number != 0) {
      digitsSum += number % 10;
      number /= 10;
    }
    return digitsSum;
  }
  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);

    int input = 0;
    int numberOfCoffeeRequest = 0;

    while (input != 42) {
      input = scanner.nextInt();
      final int digitSum = getDigitSum(input);
      if (isPrime(digitSum)) {
        ++numberOfCoffeeRequest;
      }
    }

    System.out.println("Count of coffee - request - " + numberOfCoffeeRequest);
  }
}
