import java.util.Scanner;

public class Program {
  
  final static Scanner scanner = new Scanner(System.in);
  private static final int MAX_GRADE = 10;
  private static final int GRADES_PEER_LINE = 5;
  private static final int MAX_WEEKS = 5;
  private static final String STOP_WORD = "42";
  private static long rawGrades = 0;
  private static int numberOfWeeks = 0;

  public static void main(String[] args) {
    while (numberOfWeeks < MAX_WEEKS) {
      String weekInput = scanner.nextLine();
      
      if (weekInput.equals(STOP_WORD)) {
        break;
      }

      numberOfWeeks++;

      if (!isValidWeek(weekInput, numberOfWeeks)) {
        onError();
      }

      int minGradeOnWeek = readMinGradeOfWeek();
      storeGrade(minGradeOnWeek);
    }

    for (int i = 1; i <= numberOfWeeks; i++) {
      printWeekDiagram(i);
    }
  }

  private static void storeGrade(int grade) {
    rawGrades = rawGrades * 10 + grade;
  }

  private static void printWeekDiagram(int weekNumber) {
    System.out.print("Week " + weekNumber + " ");
    
    int grade = getMinGradeOnWeek(weekNumber);
    while (grade-- != 0) {
      System.out.print("=");
    }

    System.out.println(">");
  }

  private static int getMinGradeOnWeek(int week) {
    if (week > MAX_WEEKS) {
      onError();
    }
    System.out.println(pow(10, 3));
    return (int) ((rawGrades / pow(10, numberOfWeeks - week)) % 10);
  }

  private static final void onError() {
    System.err.println("IllegalArgument");
    System.exit(-1);
  }

  private static boolean isValidWeek(String input, int currentWeek) {
    return input.equals("Week " + currentWeek);
  }

  private static int readMinGradeOfWeek() {
    int min = MAX_GRADE + 1;
    for (int i = 0; i < GRADES_PEER_LINE; i++) {
      int input = scanner.nextInt();

      if (input < min) {
        min = input;
      }
    }
    scanner.nextLine();

    return min;
  }

  private static long pow(long num, long pow) {
    if (pow == 0) {
      return 1;
    }
    long result = num;
    while (--pow > 0) {
      result *= num;
    }
    return result;
  }
}
