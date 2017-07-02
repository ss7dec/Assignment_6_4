//Assignment 6.4
//Exception Handling example
//1. Create a class BankAtm with following properties and methods-
//Properties: atmId; bankName; location; balance
//Methods: withdraw(double amt) deposit(double amt)
//The withdraw method should check the available balance in the ATM before deducting 
//the amount from the balance. If the balance is less than 10000 the withdrawal should 
//not be allowed and a user-defined exception BankATMException should be thrown. The 
//withdrawal should also not be allowed
//if the amount to be withdrawn is greater than balance. Create a user defined exception 
//class BankATMException class that will be created whenever withdrawal is done for balance 
//less than 10000. Create an application Bank having 3 BankAtm objects. Every time withdraw 
//method is called on the BankAtm object the balance should be subtracted. 

package assignment_6_4;

public class BankAtm {
	//Class declaration containing bank ATM details. 
	private int atmId;
	private String bankName;
	private String location;
	private double balance;


		
		public BankAtm(int atmId, String bankName, String location, double balance)     //constructor.
		{
			//Initializing class variables by parameters.
			this.atmId = atmId;     
			this.bankName = bankName;
			this.location = location;
			this.balance = balance;
		}
		
		public void withdraw(double amt)  throws BankAtmException       //Withdraw function to withdraw the amount.
		{
			if(balance < 10000.0 || balance < amt)       //Checking weather the withdrawal can be possible or not according to given condition.
			{
				throw new BankAtmException();        //Throwing Exception if withdrawal is not possible.
			}
			else
			{
				balance = balance - amt;          //if withdrawal can be possible then reducing the balance.
				System.out.println("\n\nYou have withdrawn "+amt+" Rs. and your available balance is "+balance+" Rs.");     //Printing the statement.
			}
		}
		
		public void deposit(double amt)     //Depositing the amount. No need to throw exception because deposit is always possible.
		{
			balance = balance + amt;       //Increasing the value of balance.
			System.out.println("\n\nYou have deposited "+amt+" Rs. and available balance is "+balance+" Rs.");     //Printing the statement.
		}
		
		public void displayAtmDetails()           //Function will display the details of ATM.
		{
			//Displaying the details of ATM.
			System.out.println("\nThe ATM Id is "+atmId);
			System.out.println("The bank name of which ATM belongs is "+bankName);
			System.out.println("The location where ATM is situated is "+location);
			System.out.println("The available balance is "+balance);
		}
		
}
