package java.org.example;

import java.util.Scanner;

public class ATM {
    // withdrawing, depositing, and checking the balance
    // withdraw(amount), deposit(amount), and checkBalance()
    public static void main(String[] args) {
        double amount;
        boolean exitFlag = false;
        Scanner scn = new Scanner(System.in);
        BankAccount account = new BankAccount();
        while(!exitFlag) {
            System.out.println("Please choose below options: ");
            System.out.println("1 Deposit Money");
            System.out.println("2 Withdraw Money");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");
            int choice = scn.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Please enter amount to be deposited: ");
                    amount = scn.nextDouble();
                    if ( amount < 0 ) {
                        System.out.println("Please enter an amount greater than 0");
                        break;
                    }
                    double updatedAmount = account.deposit(amount);
                    System.out.println("Transaction successful! Updated balance is: " + updatedAmount);
                    break;
                }
                case 2: {
                    System.out.println("Please enter amount to withdraw: ");
                    amount = scn.nextDouble();
                    account.withdraw(amount);
                    break;
                }
                case 3: {
                    System.out.println("Your account balance is: " + account.checkBalance());
                    break;
                }
                case 4: {
                    System.out.println("Closing Application. Thank you!");
                    exitFlag = true;
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Please enter values between 1 to 4 to proceed.");
            }
            System.out.println();
        }
    }
}