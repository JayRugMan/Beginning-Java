public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
	System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // greet customer
  public void greetCustomer(String customer) {
    String message = "Welcome to the store, " + customer + "!";
    System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.advertise();
    lemonadeStand.greetCustomer("Jesus");
  }
}