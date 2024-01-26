public class CarLoan {
  /*
  This program calculates monthy car payment based on:
    - Loan amount
    - lentch of loan (in years)
    - interest rate (as a percentage)
    - down paymnet amount
  */
	public static void main(String[] args) {
  int carLoan = 19026;  // Amount in dollars
  int loanLength = 4;  // Length in years
  int interestRate = 5;  // Interest rate in percentage
  int downPayment = 2000;  // Amount in dollars
	if((loanLength <= 0) || (interestRate <= 0)) {
    System.out.println("ERROR! Your loan length and/or interest rate is/are invalid.");
  } else if(downPayment >= carLoan) {
    System.out.println("FAIL! Stop right there. Why are you getting a loan?");
  } else {
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    int monthlyBalance = remainingBalance / months;
    int interest = (monthlyBalance * interestRate) / 100;
    int monthlyPayment = monthlyBalance + interest;
    System.out.println( "A car loan of $" + carLoan + ".00 at " + interestRate + "% interest over " + loanLength + " years with $" + downPayment + ".00 down will be $" + monthlyPayment + " a month.");
  }

	}
}