package com.amolatak;

public class BankingAction {
    double balance;
    double previousTransaction;

    void deposit(double amount){
        if (amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
        System.out.println("Enter valid amount.");
    }

    void withdraw( double amount){
        if (amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
        System.out.println("Enter valid amount.");
    }

    double getPreviousTransaction(){
        if (previousTransaction > 0) {
            System.out.println("Deposit: ");
            return previousTransaction;
        }
        else {
            System.out.println("Withdraw: ");
            return Math.abs(previousTransaction);
        }
    }

    double getBalance(){
        return balance;
    }
}
