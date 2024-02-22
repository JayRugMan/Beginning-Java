public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // Contructor
  public Language(String nm, int numSpkrs, String reg, String wOrd) {
    name = nm;
    numSpeakers = numSpkrs;
    regionsSpoken = reg;
    wordOrder = wOrd;
  }

  // Get info method
  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people in " + regionsSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder + ".");
  }

  public static void main(String[] args) {
    Language myLanguage = new Language("German", 100000000, "Northern Europe", "subject-object-verb");
    System.out.println(myLanguage.name);
    myLanguage.getInfo();
    Language TojolAbAl = new Mayan("Tojol-abʼal", 66953);
    TojolAbAl.getInfo();
  }
}