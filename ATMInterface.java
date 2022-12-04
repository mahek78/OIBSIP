import java.util.*;
import java.util.Scanner;
public class ATMInterface
{
    public static void main(String args[] )
    {
        int balance = 100000;
        int withdraw=0;
        int deposit=0;
        int tamt=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Automated Teller Machine Interface \n");
        System.out.println("Enter the pin: ");
        int another = 1 ;
        int pin;
        pin = sc.nextInt();

		if(pin == 2710)
		{
			System.out.println("\nPlease Enter The Option You Want!\n");

			while(another == 1)
			{
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for Transfer Money");
				System.out.println("Choose 5 for Transcation History");
				System.out.println("Choose 6 for Exit");
				System.out.print("\nChoose the operation you want to perform :");
				int choice = sc.nextInt();

				switch(choice)
				{
					case 1:
							System.out.println("\n - - - - - - - - - - - - - Withdraw - - - - - - - - - - - - -");
							System.out.print("\nEnter money to be withdrawn :");
							withdraw = sc.nextInt();
							if(balance >= withdraw)
							{
									System.out.println("\nWithdraw Operations :\n");
									System.out.println("Withdraw Money : " +withdraw);
									balance = balance - withdraw;
									System.out.println("Please collect your money");
									System.out.println("Available Balance is : "+balance);

							}
							else
							{
									System.out.println("Insufficient Balance");
							}
							System.out.println("\nDo you wish to continue [0/1] :");
							another = sc.nextInt();
							System.out.println("");
							break;

					case 2:
							System.out.println("\n - - - - - - - - - - - - - Deposit  - - - - - - - - - - - - -");
							System.out.print("\nEnter money to be deposited:");
							deposit = sc.nextInt();
							System.out.println("\nDeposit Operation :\n");
							balance = balance + deposit;
							System.out.println("Deposit Money : "+deposit);
							System.out.println("Your Money has been successfully depsited");
							System.out.println("Balance : "+balance);
							System.out.println("\nDo you wish to continue [0/1] :");
							another = sc.nextInt();
							System.out.println("");
							break;

					case 3:
							System.out.println("\nBalance : "+balance);
							System.out.println("\nDo you wish to continue [0/1] :");
							another = sc.nextInt();
							System.out.println("");
							break;

					case 4:
							System.out.println("\n - - - - - - - - - - - - - Tranfer Amount - - - - - - - - - - - - -");
							Long Accno;
							System.out.println("\nEnter the Account Number");
							Accno = sc.nextLong();
							int ifsc;
							System.out.println("\nEnter the IFSC code");
							ifsc = sc.nextInt();
							System.out.println("\nEnter the amount for Transfer");
							tamt = sc.nextInt();
							balance = balance - tamt;
							System.out.println("\nYour amount sucessfully transfered to this account " +Accno);
							int tr;
							System.out.println("\nEnter 1 for transcition recepit");
							tr = sc.nextInt();
							if(tr == 1)
							{
								System.out.println("\nAccount Number : "+Accno);
								System.out.println("IFSC Code : "+ifsc);
								System.out.println("Transfer Amount : "+tamt);
							}
							System.out.println("\nDo you wish to continue [0/1] :");
							another = sc.nextInt();
							System.out.println("");
							break;

					case 5:
							System.out.println("\n - - - - - - - - - - - - - Transcition History - - - - - - - - - - - - -");
							System.out.println("Deposit Amount : "+deposit);
							System.out.println("Withdraw Amount : "+withdraw);
							System.out.println("Transfer Amount : "+tamt);
							System.out.println("Balance Amonut : "+balance);
							System.out.println("\nDo you wish to continue [0/1] :");
							another = sc.nextInt();
							System.out.println("");
							break;




					case 6:
					        
				            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	                        System.out.println(" THANK YOU....VISIT AGAIN.....");
	                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
							System.exit(0);

				}
			}
			if(another == 0)
			{
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Please! enter the valid pin");
		}
    }
}


