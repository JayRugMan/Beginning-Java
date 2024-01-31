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

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int number: numbers) {
      if(isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }

  public int[] setRange(int start, int end) {
    int array_size = (end+1) - start;
    int[] range = new int[array_size];
    for(int i = 0; i < end; i++) {
      range[i] = i + 1;
    }
    return range;
  }

  public static void main(String[] args) {
    
    int start = 0;
    int end = 13;
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = pd.setRange(start, end);
    ArrayList<Integer> listOfPrimes = new ArrayList<Integer>(pd.onlyPrimes(numbers));
    int totalPrimes = listOfPrimes.size();
    System.out.println(listOfPrimes);
    System.out.println("\nTotal number of primes between " + start + " and " + end + ": " + totalPrimes);

  }
}
