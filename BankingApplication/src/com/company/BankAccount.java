package com.company;

import java.util.Scanner;

class BankAccount {

    //Variables

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;


    //Constructors

    public BankAccount(String customer_name, String customer_Id){
        this.customerName = customer_name;
        this.customerId = customer_Id;
    }

    //Methods

    public void deposit(int amount){
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount){
        if(amount != 0){
            balance  = balance - amount;
            previousTransaction =- amount;
        }
    }

    public void getPreviousTransaction(){
        if(previousTransaction >= 0){
            System.out.println("Deposited: " + previousTransaction);
        }else if(previousTransaction <= 0){
            System.out.println("You withdrew: " + previousTransaction);
        }else{
            System.out.println("No Transaction occurred");
        }
    }

    public void showMenu() {
        char input = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your Customer Id is: " + customerId);
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("Please enter an option: ");
        System.out.println("====================================");

        System.out.println("A.Check Balance");
        System.out.println("B.Deposit");
        System.out.println("C.Withdraw");
        System.out.println("D.Previous transaction");
        System.out.println("E.EXIT");

        do {
            System.out.println("Please enter an option: ");
            input = scanner.next().charAt(0);
            System.out.println("\n");

            switch (input){
                case 'A':
                    System.out.println("Balance = " + this.balance);
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    this.deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    this.withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    this.getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid Option! Please enter again!");
                    break;
            }
        } while (Character.isAlphabetic(input));

        System.out.println("Thank you for using our services!");
    }
}
