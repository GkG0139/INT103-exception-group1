import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient {

  public static void quotient() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter two integers: ");
      int dividend = scanner.nextInt();
      int divisor = scanner.nextInt();

      if (divisor == 0) throw new ArithmeticException(
        "Error: divisor cannot be zero."
      );

      double result = (double) dividend / divisor;
      System.out.println(dividend + "/" + divisor + " is " + result);
    } catch (InputMismatchException e) {
      System.out.println("Error: please enter two integers.");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
