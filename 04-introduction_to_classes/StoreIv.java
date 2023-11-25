public class StoreIv {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public StoreIv(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    StoreIv cookieShop = new StoreIv("cookies", 12, 3.75);
    System.out.println("We sell " + cookieShop.productType + " for $" + cookieShop.inventoryPrice + "!");
  }
}
