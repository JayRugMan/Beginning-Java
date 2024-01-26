import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Sol");
    desertIslandPlaylist.add("Siren");
    desertIslandPlaylist.add("Deeper Still");
    desertIslandPlaylist.add("Sakura");
    desertIslandPlaylist.add("Goodness");
    desertIslandPlaylist.add("Spark");
    desertIslandPlaylist.add("Ghost Pong");
    desertIslandPlaylist.add("Swag");
    desertIslandPlaylist.add("Neptune");
    for(String song : desertIslandPlaylist) {
      System.out.println(song);
    }
    int overLimit = desertIslandPlaylist.size() - 5;
    System.out.println("You have selected " + desertIslandPlaylist.size() + " songs for your retreat. you need to get rid of " + overLimit + " of them.");

    desertIslandPlaylist.remove("Swag");
    overLimit = desertIslandPlaylist.size() - 5;
    System.out.println("You have selected " + desertIslandPlaylist.size() + " songs for your retreat. you need to get rid of " + overLimit + " of them.");
    for(String song : desertIslandPlaylist) {
      System.out.println(song);
    }

    desertIslandPlaylist.remove("Deeper Still");
    overLimit = desertIslandPlaylist.size() - 5;
    System.out.println("You have selected " + desertIslandPlaylist.size() + " songs for your retreat. you need to get rid of " + overLimit + " of them.");
    for(String song : desertIslandPlaylist) {
      System.out.println(song);
    }

    desertIslandPlaylist.remove("Neptune");
    overLimit = desertIslandPlaylist.size() - 5;
    System.out.println("You have selected " + desertIslandPlaylist.size() + " songs for your retreat. you need to get rid of " + overLimit + " of them.");
    for(String song : desertIslandPlaylist) {
      System.out.println(song);
    }

    desertIslandPlaylist.remove("Goodness");
    overLimit = desertIslandPlaylist.size() - 5;
    System.out.println("You have selected " + desertIslandPlaylist.size() + " songs for your retreat. you need to get rid of " + overLimit + " of them.");
    for(String song : desertIslandPlaylist) {
      System.out.println(song);
    }

    // Swapping order
    System.out.println("\nNew Order:");
    int songAIdx = desertIslandPlaylist.indexOf("Siren");
    int songBIdx = desertIslandPlaylist.indexOf("Spark");
    String holdMe = desertIslandPlaylist.get(songAIdx);
    desertIslandPlaylist.set(songAIdx, desertIslandPlaylist.get(songBIdx));
    desertIslandPlaylist.set(songBIdx, holdMe);
    for(String song : desertIslandPlaylist) {
      System.out.println(song);
    }

  }
  
}