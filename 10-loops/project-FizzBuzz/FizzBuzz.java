public class FizzBuzz {
  public static void main(String[] args) {
    String out = "";
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        out = "Fizz";
      }
      if (i % 5 == 0) {
        out = out + "Buzz";
      }
      if (out == "") {
        out = out + i;  // int into string
      }
      System.out.println(out);
      out = "";
    }
  }
}