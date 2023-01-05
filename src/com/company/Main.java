package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //making a bank account with user input feature
        Scanner user = new Scanner(System.in);
        BankAccount[] a = new BankAccount[100];//makes an array of 100 accounts because we know that the user will create at most 100 accounts
        int i = 0;
        while(i < 100){//while there are less than 100 accounts
            System.out.println("1. Create new account");
            System.out.println("2. View all accounts");
            System.out.println("3. Quit");
            System.out.println("Enter your selection:");
            int choice = user.nextInt();//takes the user input
            if (choice == 1){
                a[i] = new BankAccount();//make a new bank account
                System.out.println("Enter the name");
                String n = user.next();
                a[i].setName(n);//sets the name to what the user inputted as the name
                System.out.println("Enter the balance");
                int b = user.nextInt();
                a[i].setBalance(b);//sets the balance to what the user inputed as the balance
                i++;
            } else if (choice == 2){
                for (int j = 0; j < i; j++){
                    System.out.println(a[j].getName() + " has $" + a[j].getBalance());//prints out the accounts made so far
                }
            } else {
                i = 100; //to quit, sets i to 100 so it breaks out of the while loop
            }
        }
    }//end main
}//end Main class
