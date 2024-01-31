public class DNA {
  /*
  Takes a sequence of A's, C's, T's, and G's (DNA) and returns whether or not it's a sequence that codes for a protein
  */

  public static void main(String[] args) {

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    String protein = "No protein";

    //JH System.out.println("Start: " + start);
    //JH System.out.println("Stop: " + stop);
    if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      protein = dna.substring(start, stop + 3);
    }
    System.out.println("Protein: " + protein);
    
  }

}
