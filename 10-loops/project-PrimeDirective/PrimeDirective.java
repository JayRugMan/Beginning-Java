// Import statements:
import java.util.ArrayList;

public class PrimeDirective {

  // Add your methods here:
  public boolean isPrime(int number) {
    if (number == 1 || number == 0) {
      return false;
    }
    for(int i = 2; i < number; i++) {
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
  
    PrimeDirective pd = new PrimeDirective();
    //int[] numbers = {0, 1, 2, 6, 29, 28, 33, 11, 100, 101, 43, 89};
    //for (int num: numbers) {
    for(int num = 0; num <= 100; num++) {
      if (pd.isPrime(num)) {
        System.out.println(num + " is prime");
      } else {
        System.out.println(num + " is NOT prime");
      }
    }

  }
}
