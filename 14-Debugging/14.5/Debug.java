public class Debug {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    
    try{

      // Try deviding to get ratio
      int ratio = length / width;

    } catch(ArithmeticException e) {

      // Print error if attempt gets ArithmeticException
      System.err.println("ERROR: The width cannot be '0'.");

    }
        
  }
  
}