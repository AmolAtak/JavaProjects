package com.amolatak;

public class BankAccount {
    private final String customerName;
    private final String customerId;

    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;

    }

    void showOption() {
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is: " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
    }



}
