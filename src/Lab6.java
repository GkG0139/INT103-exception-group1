public class Lab6 {

  public static void main(String[] args) {
    try {
      System.out.println(1 / 0);
    } catch (ArithmeticException exception) {
      exception.printStackTrace();
      System.out.println(exception.getMessage());
      System.out.println(exception.toString());
      StackTraceElement[] stack = exception.getStackTrace();
      for (int i = 0; i < stack.length; i++) {
        System.out.println(stack[i].getClassName());
        System.out.println(stack[i].getMethodName());
        System.out.println(stack[i].getFileName());
        System.out.println(stack[i].getLineNumber());
      }
    }
  }
}
