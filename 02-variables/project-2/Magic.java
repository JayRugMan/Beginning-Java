public class Magic {
	public static void main(String[] args) {

		// myNumber is the "original number"
    int myNumber = 4526;

    /* original
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    */

    /* iteration 2
    int magicNumber = myNumber * myNumber;
    magicNumber = magicNumber + myNumber;
    magicNumber = magicNumber / myNumber;
    magicNumber = magicNumber + 17;
    magicNumber = magicNumber - myNumber;
    magicNumber = magicNumber / 6;
    */

    int magicNumber = (((myNumber * myNumber + myNumber) / myNumber + 17) - myNumber) / 6 ;

    // Final output
    System.out.println(magicNumber);
	}
}