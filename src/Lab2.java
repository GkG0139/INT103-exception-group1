public class Lab2 {

  public static void main(String[] args) {
    int[] list = new int[10];
    try {
      System.out.println(list[10]);
    } catch (IndexOutOfBoundsException exception) {
      System.out.println(exception.getMessage());
    } catch (RuntimeException exception) {
      System.out.println("RuntimeException");
    } catch (Exception exception) {
      System.out.println("Exception");
    }
  }
}
