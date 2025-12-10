package org.example;

public class Main {
    public static void main(String[] args) {
        Account newAccount=new Account("1234",0.0,"Bhasu","bhasurapraneeth@gmail.com","0714557789");
        newAccount.DepositMoney(100);
        newAccount.DepositMoney(150);
        newAccount.WithdrawMoney(100);
        newAccount.WithdrawMoney(100);
    }
}