package com.company;

public class BankAccount {
    //class variables are static
    //all variables are private

    //instance variables (non static object levels)
    private double balance;
    private String name;
    private int accountNumber;
    private int accountsCreated;

    public BankAccount(){
        name = "";
        balance = 10;
        accountsCreated++;
        if (accountsCreated%100 == 0){ //to account for bonuses for every 100 accounts created
            balance = 100 + balance; //100 dollar bonus
        }
        accountNumber = 10000000 + accountsCreated;

    }

    public BankAccount(String n, double b){
        name = n;
        balance = b;
        accountsCreated++;
        if (accountsCreated%100 == 0){ //to account for bonuses for every 100 accounts created
            balance = 100 + balance; //100 dollar bonus
        }
        accountNumber = 10000000 + accountsCreated;
    }

    public double getBalance(){
        return balance; //to access from outside, since it is a private variable
    }

    public String getName(){
        return name; //to access from outside, since it is a private variable
    }

    public int getAccountNumber(){
        return accountNumber; //to access from outside, since it is a private variable
    }

    public int getAccountsCreated(){
        return accountsCreated; //to access from outside, since it is a private variable
    }

    public void setName(String newName){
        name = newName; //changing the name of the bank account
    }

    public void setBalance(int newBalance){
        balance = newBalance; //setting the new balance to override the previous one
    }

    public String toString(BankAccount a){
        String rv = "";
        rv = a.name + "'s account " + a.accountNumber + " has a balance of $" + a.balance + "."; //printing each part of the bank account and concatenating it to a string
        return rv;
    }

}
