public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog cali = new Dog("labradoodle", true, 6);
    Dog moose = new Dog("cacapoo", true, 1);
    boolean isCaliOlder = cali.age > moose.age;
    int totalDogYears = moose.age + cali.age;
    System.out.println("Two dogs created: a " + cali.breed + " and a " + moose.breed);
    System.out.println("The statement that cali is an older dog is: " + isCaliOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}