public class GreaterLessThan {
    public static void main(String[] args) {   
		double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsAfterSeminar = creditsOfSeminar + creditsEarned;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);
        System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}
