import java.text.NumberFormat;
import java.util.Locale;

public class Language {

  protected String name;
  protected String numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // Contructor
  public Language(String nm, int numSpkrs, String reg, String wOrd) {
    NumberFormat format = NumberFormat.getInstance(Locale.US);
    name = nm;
    numSpeakers = format.format(numSpkrs);
    regionsSpoken = reg;
    wordOrder = wOrd;
  }

  // Get info method
  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people in " + regionsSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder + ".\n");
  }

  public static void main(String[] args) {

    // Instantiate languages
    Language myLanguage = new Language("German", 130000000, "Northern Europe", "subject-object-verb");
    Language TojolAbAl = new Mayan("Tojol-abʼal", 66953);
    Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 940000000);
    Language burmese = new SinoTibetan("Burmese", 33000000);

    // Get Language info
    myLanguage.getInfo();
    TojolAbAl.getInfo();
    mandarinChinese.getInfo();
    burmese.getInfo();
  }
}