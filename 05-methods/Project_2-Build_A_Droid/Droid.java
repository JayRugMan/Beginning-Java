public class Droid {
  // Instance Fields
  int batteryLevel;
  String name;

  // Contructor Method
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  // to string method
  public String toString() {
    return "Hi, friend. My Name is " + name + ". My battery is at " + batteryLevel + "%.";
  }

  // Perform a task
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  // State battery level
  public int energyReport() {
    return batteryLevel;
  }

  // Energy transfer
  public void energyTransfer(Droid donerDroid, int energyGift) {
    batteryLevel += energyGift;
    donerDroid.batteryLevel -= energyGift;
    System.out.println(energyGift + "% transfered from " + donerDroid.name + " to " + name + "...");
  }

  // The Main event
  public static void main(String[] args) {
    Droid myDroid = new Droid("Codey");
    Droid newDroid = new Droid("Rex");
    System.out.println(myDroid);
    System.out.println(newDroid);
    myDroid.performTask("Making Breakfast");
    String batReport = myDroid.name + ": " + myDroid.energyReport() + "%";
    System.out.println(batReport);
    batReport = newDroid.name + ": " + newDroid.energyReport() + "%";
    System.out.println(batReport);
    myDroid.energyTransfer(newDroid, 5);
    batReport = myDroid.name + ": " + myDroid.energyReport() + "%";
    System.out.println(batReport);
    batReport = newDroid.name + ": " + newDroid.energyReport() + "%";
    System.out.println(batReport);
  }
}