public class Lab4 {

  public static void main(String[] args) {
    try {
      System.out.println("Statement 1");
      System.out.println(1 / 0);
      System.out.println("Statement 2");
    } catch (ArrayIndexOutOfBoundsException exception) {} catch (
      ArithmeticException exception
    ) {
      throw new StringIndexOutOfBoundsException();
    } finally {
      System.out.println("Statement 4");
    }
    System.out.println("Statement 5");
  }
}
