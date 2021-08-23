public class Program {

  private static int getDigitSum(int number) {
    int digitsSum = 0;

    while (number != 0) {
      digitsSum += number % 10;
      number /= 10;
    }
    return digitsSum;
  }
  public static void main(String[] args)  {
    int someNumber = 479598;
    
    System.out.println(getDigitSum(someNumber));
  }
}
