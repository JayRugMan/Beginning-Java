public class Calculator {
  /*
  This class has a method for each basic arithmatic operation, 
  Addition, Subtraction, Multiplication, division, and Modulo. Each 
  method takes 2 integers as arguments and returns 1 integer as the 
  solution
  */

  // Constructor Method
  public Calculator() {}

  // Addition Method
  public int add(int a, int b) {
    return a + b;
  }

  // Subtraction Method
  public int subtract(int a, int b) {
    return a - b;
  }

  // Multiplication Method
  public int multiply(int a, int b) {
    return a * b;
  }

  // Division Method
  public int divide(int a, int b) {
    if(b==0) {
      System.out.println("I'm not Chuck Norris. Ask him to divide " + a + " by " + b + "!");
      return b;
    }
    return a / b;
  }

  // modullo Method
  public int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.divide(42, 0));
    System.out.println(myCalculator.multiply(1024, 1024));
    System.out.println(myCalculator.modulo(128, 2));
  }
}
