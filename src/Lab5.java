public class Lab5 {

  public static void main(String[] args) {
    System.out.println("Method main(String[] args) calling method doThat()");
    try {
      doThis();
    } catch (Exception exception) {
      System.out.println("Error:" + exception.getClass());
    }
  }

  public static void doThis() throws Exception {
    System.out.println("Method doThis() calling method doThat()");
    doThat();
  }

  public static void doThat() throws Exception {
    throw new Exception();
  }
}
