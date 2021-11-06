package com.company;

import java.util.Scanner;
import java.util.function.Predicate;

// Display a Welcome message to the user
// Display 5 options to the users - Check Balance, Deposit, Withdraw, Check previous transaction, Exit

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Customer Name", "Customer ID");
        bankAccount.showMenu();
    }
}

