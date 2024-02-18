package org.example;

public class BankAccount {
    private double accountBalance;

    public BankAccount() {
        this.accountBalance = 0.00;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double deposit(double amount) {
        double updatedBalance = getAccountBalance() + amount;
        setAccountBalance(updatedBalance);
        return updatedBalance;
    }

    public void withdraw(double amount) {
        if (getAccountBalance() < amount) {
            System.out.println("Insufficient Funds! Your current balance is: " + getAccountBalance());
        }
        else {
            double updatedBalance = getAccountBalance() - amount;
            setAccountBalance(updatedBalance);
            System.out.println("Your account balance is: " + updatedBalance);
        }
    }

    public double checkBalance() {
        return getAccountBalance();
    }
}
