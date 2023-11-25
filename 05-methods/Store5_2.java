public class Store5_2 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store5_2(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store5_2 lemonadeStand = new Store5_2("Lemonade", 3.75);
    System.out.println(lemonadeStand.price);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}