package com.amolatak;

public class Main {

    public static void main(String[] args) {
        var account = new BankAccount("Amol", "AVA2312");
        account.showOption();

        var action = new BankingAction();

        var choose = new ChooseOptions(action);
        choose.options();
    }
}
