public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    // Create instances here
    Reservation partyOfNine = new Reservation(9, 14, true);
    Reservation partyOfNone = new Reservation(0, 1, true);
    Reservation partyOfFive = new Reservation(5, 5, true);
    Reservation partyOfSix = new Reservation(6, 5, true);
    Reservation partyOfThree = new Reservation(3, 12, false);
    Reservation partyOfTwo = new Reservation(2, 1, true);
    partyOfNine.confirmReservation();
    partyOfNine.informUser();
    partyOfNone.confirmReservation();
    partyOfNone.informUser();
    partyOfFive.confirmReservation();
    partyOfFive.informUser();
    partyOfSix.confirmReservation();
    partyOfSix.informUser();
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfTwo.confirmReservation();
    partyOfTwo.informUser();
  }
}