package assignment_6_4;


	import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

	/*
	 * This assignment helped me to master the concepts of Exception handling and method to define Exception class.
	 */

	public class Assignment6_4      //Class declaration containing main function. 
	{
		public static void main(String[] args)      //main function declaration. and because it is static, program execution starts from main function. 
		{
			System.out.println("Enter the ATM details : ATM Id, Bank name, Loaction, Balance space seperately");
			// asking values of ATM details from the user.
	        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
			
			
			//Now we want to take input of the values of ATM details from the user.
	      	// For taking input from the user, we have to make the object of Scanner class.
	      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
			
			Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
			
			BankAtm AtmDemo = new BankAtm(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			//Created the BankATM class object and passed the parameters in the constructor which are input by user.
			
			AtmDemo.deposit(10000.0);       //Depositing the amount in the ATM.
			
			try        //try block.
			{
			    AtmDemo.withdraw(1500.0);      //Withdraw the amount from the ATM.
			}
			catch(BankAtmException e)       //catch block.
			{
				System.out.println(e);      //Printing the Exception.
			}
			
			AtmDemo.displayAtmDetails();        //Displaying the ATM details.
			
			try        //try block.
			{
			    AtmDemo.withdraw(100.0);      //Withdraw the amount from the ATM.
			}
			catch(BankAtmException e)       //catch block.
			{
				System.out.println(e);      //Printing the Exception.
			}
			
			
			sc.close();      //Closing the Scanner class object.
		}     //End of main function.

	}
