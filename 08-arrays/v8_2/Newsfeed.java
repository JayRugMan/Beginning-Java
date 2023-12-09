public class Newsfeed {
  
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science","Health"};
    return topics;
  }
  
  public Newsfeed(){
    
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
  }
}
