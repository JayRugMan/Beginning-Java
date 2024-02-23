class Mayan extends Language {

  Mayan(String mName, int mNumSpeakers) {
    super(mName, mNumSpeakers, "Central America", "verb-object-subject");
  }

  // Override get info method
  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder + ".");
    System.out.println("Fun Fact: " + this.name + " is an ergative language.\n");
  }

}
