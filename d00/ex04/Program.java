import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    char[] data = input.toCharArray();
    char[] numberOfChars = new char[65535];

    for (int i = 0; i < data.length; i++) {
      numberOfChars[data[i]]++;
    }


  }
}
