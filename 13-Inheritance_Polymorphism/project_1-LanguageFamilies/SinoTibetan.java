class SinoTibetan extends Language{

  // Contructor Module
  SinoTibetan(String sName, int sNumSpeakers) {
    super(sName, sNumSpeakers, "Asia", "subject-object-verb");
    if(this.name.contains("Chinese")){
      this.wordOrder = "subject-verb-object";
    }
  }


}
