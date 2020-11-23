package com.amolatak;

import java.util.Scanner;

public class ChooseOptions {
    private final BankingAction action;
    private final Scanner scanner = new Scanner(System.in);

    public ChooseOptions(BankingAction action) {
        this.action = action;
    }

    public void options(){
        String option;
        do {
            System.out.println("----------------------------------");
            System.out.println("Choose an option: ");
            System.out.println("----------------------------------");
            option = scanner.next();
            System.out.println();

            double amount;
            switch (option) {
                case "A" -> {
                    System.out.println("..................................");
                    System.out.println("Your Balance: " + action.getBalance());
                    System.out.println("..................................");
                    System.out.println();
                }
                case "B" -> {
                    System.out.println("..................................");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("..................................");
                    amount = scanner.nextDouble();
                    action.deposit(amount);
                    System.out.println("Deposited Successfully.");
                    System.out.println();
                }
                case "C" -> {
                    System.out.println("..................................");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("..................................");
                    amount = scanner.nextDouble();
                    action.withdraw(amount);
                    System.out.println("Withdrawn Successfully.");
                    System.out.println();
                }
                case "D" -> {
                    System.out.println("..................................");
                    System.out.println("Previous Transaction");
                    System.out.println("..................................");
                    System.out.println(action.getPreviousTransaction());
                    System.out.println();
                }
                case "E" -> {
                    System.out.println("**********************************");
                    System.out.println("Thank You!!!");
                    System.out.println("**********************************");
                    System.out.println();
                }
                default -> {
                    System.out.println("Please choose valid option.");
                    System.out.println();
                }
            }
        } while(!option.equals("E"));
    }
}
