import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> FamilyMembers = new ArrayList<String>();
    FamilyMembers.add("Jason");
    FamilyMembers.add("Isaiah");
    FamilyMembers.add("Elijah");
    int totalMembers = FamilyMembers.size();

    // 2015
    System.out.println("New Years Day, 2015");
    System.out.println("We had " + totalMembers + " members of our family.\n");
    System.out.println("These are their names: ");
    for(String name : FamilyMembers) {
      System.out.println(name);
    }
    // Kara and her dog, Harry join the family in December of 2015
    FamilyMembers.add(1, "Kara");
    FamilyMembers.add("Harry");
    totalMembers = FamilyMembers.size();

    // 2016
    System.out.println("\nNew Years Day, 2016");
    System.out.println("We had " + totalMembers + " members of our family.\n");
    System.out.println("These are their names: ");
    for(String name : FamilyMembers) {
      System.out.println(name);
    }
    // Cali joins the family in the spring of 2018
    FamilyMembers.add("Cali");
    totalMembers = FamilyMembers.size();

    // 2019
    System.out.println("\nNew Years Day, 2019");
    System.out.println("We had " + totalMembers + " members of our family.\n");
    System.out.println("These are their names: ");
    for(String name : FamilyMembers) {
      System.out.println(name);
    }
    // Benji is born in 2020
    int harryIdx = FamilyMembers.indexOf("Harry");
    FamilyMembers.add(harryIdx, "Benjamin");
    totalMembers = FamilyMembers.size();

    // 2021
    System.out.println("\nNew Years Day, 2021");
    System.out.println("We had " + totalMembers + " members of our family.\n");
    System.out.println("These are their names: ");
    for(String name : FamilyMembers) {
      System.out.println(name);
    }
    // Harry dies in 2021ish
    FamilyMembers.remove("Harry");
    totalMembers = FamilyMembers.size();

    // 2022
    System.out.println("\nNew Years Day, 2022");
    System.out.println("We had " + totalMembers + " members of our family.\n");
    System.out.println("These are their names: ");
    for(String name : FamilyMembers) {
      System.out.println(name);
    }
    // We get Moose in 2022
    FamilyMembers.add("Moose");
    totalMembers = FamilyMembers.size();

    // 2023
    System.out.println("\nNew Years Day, 2023");
    System.out.println("We had " + totalMembers + " members of our family.\n");
    System.out.println("These are their names: ");
    for(String name : FamilyMembers) {
      System.out.println(name);
    }

    int lastIdx = totalMembers - 1;
    String lastMember = FamilyMembers.get(lastIdx);
    System.out.println("\nThe latest addition to our family is " + lastMember);

  }
  
}